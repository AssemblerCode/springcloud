package com.mashibing.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("cloud-seata-order-service")
public interface OrderService {
    @GetMapping("/order/createOrder")
    String createOrder();
}
