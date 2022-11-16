package com.mashibing.seata.service.impl;

import com.mashibing.seata.PayMapper;
import com.mashibing.seata.service.OrderService;
import com.mashibing.seata.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl  implements PayService {
    @Autowired
    PayMapper pm;
    
    @Autowired
    OrderService os;

    @Override
    public Integer payment() {
        int id = pm.payment(1);
        int i = id / 0;
        String order = os.createOrder();
        return id;
    }
}
