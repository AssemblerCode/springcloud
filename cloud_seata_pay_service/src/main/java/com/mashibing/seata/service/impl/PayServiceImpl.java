package com.mashibing.seata.service.impl;

import com.mashibing.seata.PayMapper;
import com.mashibing.seata.service.OrderService;
import com.mashibing.seata.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService {
    @Autowired
    PayMapper pm;

    @Autowired
    OrderService os;


    @Override
    public Integer payment()   {
        pm.payment(1);
        String order = os.createOrder();
        int i = 1 / 0;
        return 0;
    }
}
