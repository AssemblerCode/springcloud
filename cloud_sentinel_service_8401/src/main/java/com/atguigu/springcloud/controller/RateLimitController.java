package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.nacos.common.util.UuidUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitController {
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "")
    String  byResource() {
        String res = "{\"code\":200,\"msg\":\"succ\",\"data\":"+ UuidUtils.generateUuid() +"}";
         return res;
    }


}
