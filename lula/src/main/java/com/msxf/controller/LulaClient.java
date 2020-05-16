package com.msxf.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "saas")
public interface LulaClient {
    @RequestMapping(value="/xx" , method = RequestMethod.GET)
    String getSaasInfoByRibbion();
    }


