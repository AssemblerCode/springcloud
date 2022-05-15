package com.atguigu.springcloudAlibaba.controller;

import com.alibaba.nacos.common.util.UuidUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {

    @Value("${server.port}")
    private String  port;

    @GetMapping("/createOrderNo/{id}")
    String getOrderNo(@PathVariable("id")Long id){
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>port:"+port+">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        return UuidUtils.generateUuid();
    }

}
