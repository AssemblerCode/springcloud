package com.mashibing.seata.controller;


import com.mashibing.seata.service.PayService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    @Autowired
    PayService ps;

    @GlobalTransactional
    @GetMapping("/payment")
    String payment() throws Exception {
        Integer id = ps.payment();
        return "success:200"+id;
    }
}
