package com.mashibing.seata.service.impl;


import com.mashibing.seata.mapper.OrderMapper;
import com.mashibing.seata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper om;

    @Override
    public String createOrder() {
        int order = om.createOrder();
        return String.valueOf(order);
    }
}
