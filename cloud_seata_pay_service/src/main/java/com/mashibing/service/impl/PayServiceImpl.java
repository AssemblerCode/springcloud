package com.mashibing.service.impl;

import com.mashibing.mapper.PayMapper;
import com.mashibing.service.OrderService;
import com.mashibing.service.PayService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl   implements PayService {

    @Autowired
    PayMapper pm;

    @Autowired
    OrderService os;

    @GlobalTransactional
    @Override
    public Integer payment() {
        pm.payment(1);
        String order = os.createOrder();
        System.out.println("order=="+order);
        int i = 1 / 0;
        return 0;
    }
}
