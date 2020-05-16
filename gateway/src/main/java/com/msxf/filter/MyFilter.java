package com.msxf.filter;

import javax.servlet.http.HttpServletRequest;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
 
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
//使用zuul网关接口拦截参数
@Component
public class MyFilter extends ZuulFilter {
 
    private static Logger log = LoggerFactory.getLogger(MyFilter.class);
 
    @Override
    public String filterType() {
        return "pre";
    }
 
    @Override
    public int filterOrder() {
        return 10;
    }
 
    public boolean shouldFilter() {
        return true;
    }
 
    public Object run() {
        //拦截所有请求
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        //获取请求token参数
        Object accessToken = request.getParameter("token");
        //请求来源
        String refer=request.getHeader("refer");
        //token不等于null的时候返回null，表示直接放行，否则就拦截
        if (accessToken != null) {
            return null;
        }
        log.warn("token is empty");
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(401);
        try {
            ctx.getResponse().getWriter().write("token is empty");
        } catch (Exception e) {
        }
        return null;
    }
}