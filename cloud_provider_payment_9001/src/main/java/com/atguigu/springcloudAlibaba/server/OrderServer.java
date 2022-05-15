package com.atguigu.springcloudAlibaba.server;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("nacos-consumer-order")
public interface OrderServer {

    @GetMapping("/order/createOrderNo/{id}")
    String getOrderNo(@PathVariable("id") Long id);

}
