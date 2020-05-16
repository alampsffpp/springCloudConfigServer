package com.controller;

//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/ai")
public class TestController {

    @GetMapping("/yy")
    public String yy( ) {
        return "hi vqa !!!";
    }

//    @GetMapping("/normal")
//    @PreAuthorize("hasAuthority('ROLE_NORMAL')")
//    public String normal( ) {
//        return "normal permission test success !!!";
//    }
//
//    @GetMapping("/medium")
//    @PreAuthorize("hasAuthority('ROLE_MEDIUM')")
//    public String medium() {
//        return "medium permission test success !!!";
//    }
//
//    @GetMapping("/admin")
//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
//    public String admin() {
//        return "admin permission test success !!!";
//    }


}