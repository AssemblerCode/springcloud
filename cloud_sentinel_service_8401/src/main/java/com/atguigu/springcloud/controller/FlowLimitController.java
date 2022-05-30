package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/getA")
    String getA(){
        return "Result A";
    }

    @GetMapping("/getB")
    String getB(){
        return "Result B";
    }
}
