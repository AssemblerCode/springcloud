package com.atguigu.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class MyHandler {
    public static String checkParam(  String p1, String p2, String p3,BlockException ex){
        return "Result checkParamEx";
    }
}
