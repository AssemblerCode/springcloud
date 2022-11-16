package com.mashibing.seata.controller;

import com.mashibing.seata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService os;

    @GetMapping("/createOrder")
    String createOrder(){
        String order = os.createOrder();
        return order;
    }
}
