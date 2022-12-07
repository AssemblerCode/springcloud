package com.mashibing.controller;


import com.mashibing.service.impl.PayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    @Autowired
    PayServiceImpl  ps;

    @GetMapping("/payment")
    String payment() throws Exception {
        Integer id = ps.payment();
        return "success:200" + id;
    }
}
