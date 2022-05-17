package com.javacto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * liu
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication3 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication3.class);
    }
}
