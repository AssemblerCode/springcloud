package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.handler.MyHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/getA")
    String getA() {
        log.info(Thread.currentThread().getName() + "-getA");
        return "Result A";
    }

    @GetMapping("/getB")
    String getB() {
        log.info(Thread.currentThread().getName() + "-getB");
        return "Result B";
    }

    @GetMapping("/getC")
    String getC() {
        log.info("getC异常比例");
        int i = 10 / 0;
        return "Result C";
    }

    @GetMapping("/hotKey")
    @SentinelResource(value = "hotKey",blockHandlerClass = MyHandler.class,blockHandler = "checkParam")
    String hotKey(@RequestParam(value = "p1", required = false) String param1, @RequestParam(value = "p2", required = false) String param2, @RequestParam(value = "p3", required = false) String param3) {
        return "Result hotKey";
    }

    public String checkParamEx(String p1, String p2, String p3, BlockException ex){
        return "Result checkParamEx";
    }
}
