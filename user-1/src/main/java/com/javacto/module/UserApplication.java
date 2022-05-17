package com.javacto.module;

import com.javacto.config.Rule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * liu
 **/
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@RibbonClient(name = "SERVER-ORDER",configuration = Rule.class)
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }
}
