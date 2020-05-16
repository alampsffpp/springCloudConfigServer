package com.msxf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    SaasClient saasClient;


    @GetMapping("/xx")
    public String xx( ) {
        System.out.println("hi saas !!!");
        return "hi saas !!!";
    }


    @GetMapping("/getLulaZZInterfaceInfo")
    String getLulaZZInterfaceInfo(){
        return saasClient.getLulaZZInterfaceInfo();
    }

}


