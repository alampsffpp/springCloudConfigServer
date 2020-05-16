package com.msxf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {

    @Autowired
    RestTemplate  restTemplate;

    @Autowired
    LulaClient lulaClient;

    public TestController() {


    }



    @GetMapping("/zz")
    public String xx( ) {

        System.out.println("lula"+"zzzzzzzzzzzzzzz");
        return "hi zz !!!";
    }


    @GetMapping("/getSaasInfoByRibbion")
    public String getSaasInfoByRibbion( ) {
        return  lulaClient.getSaasInfoByRibbion();
    }


//    @GetMapping("/getSaasInfoByRibbion")
//    public String getSaasInfoByRibbion(HttpServletRequest request) {
//        request.setAttribute("token","1111");
//        String xxx= restTemplate.postForEntity(
//                //http://localhost:9527/aaaa/xx?token=1111
//                "http://saas/xx",
//                request,
//                String.class
//        ).getBody();
//        return   xxx;
//
//    }



}