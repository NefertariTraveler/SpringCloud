package com.javacto.module.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * liu
 **/
@RestController
@RequestMapping("/order")
public class OrderController {
    @RequestMapping("/info")
    public Map<String,Object> info(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("server-order","order-1");
        return map;
    }
}
