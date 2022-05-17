package com.javacto.module.serviceclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * liu
 **/
@FeignClient("SERVER-ORDER")
public interface OrderServiceClient {
    @RequestMapping("/order/info")
    Object info();
}
