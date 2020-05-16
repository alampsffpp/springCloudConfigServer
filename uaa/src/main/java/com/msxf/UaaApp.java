package com.msxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableEurekaClient

//@EnableDiscoveryClient
//@EnableHystrix
//@EnableFeignClients(basePackages = {"com.bdkj"})
public class UaaApp {
    public static void main(String[] args) {

        SpringApplication.run( UaaApp.class, args );
    }
}
