package com.mashibing.seata.controller;

import com.mashibing.seata.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService gs;

    @GetMapping("/divCount")
    public String divCount(){
        String order = gs.divCount();
        return order;
    }
}
