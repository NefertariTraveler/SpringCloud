package com.javacto.module.controller;

import com.javacto.module.serviceclient.OrderServiceClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * liu
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    OrderServiceClient orderServiceClient;
    @RequestMapping("/info")
    public Object info(){
        return orderServiceClient.info();
    }
}
