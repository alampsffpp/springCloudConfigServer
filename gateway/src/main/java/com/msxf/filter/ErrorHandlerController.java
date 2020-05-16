//package com.msxf.filter;
//
//import com.netflix.zuul.context.RequestContext;
//import org.springframework.boot.web.servlet.error.ErrorController;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletResponse;
//
//@RestController
//public class ErrorHandlerController implements ErrorController {
//
//    /**
//     * 出异常后进入该方法，交由下面的方法处理
//     */
//    @Override
//    public String getErrorPath() {
//        return "/error";
//    }
//
//    @RequestMapping("/error")
//    public String error() {
//        return "出现异常";
//    }
//}