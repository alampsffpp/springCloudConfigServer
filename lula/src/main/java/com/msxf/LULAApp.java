package com.msxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients


@EnableHystrix
@EnableCircuitBreaker
//@EnableHystrixDashboard
public class LULAApp {
    public static void main(String[] args) {

        SpringApplication.run( LULAApp.class, args );
    }
}
