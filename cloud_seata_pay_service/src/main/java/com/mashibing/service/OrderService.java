package com.mashibing.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("goods-service")
public interface OrderService {
    @GetMapping("/goods/divCount")
    String createOrder();
}
