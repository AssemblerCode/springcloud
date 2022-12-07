package com.mashibing.seata.service.impl;

import com.mashibing.seata.mapper.GoodsMapper;
import com.mashibing.seata.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GoodsServiceImpl  implements GoodsService {
    @Resource
    GoodsMapper gm;

//    @Transactional(rollbackFor = {Exception.class,RuntimeException.class})
    @Override
    public String divCount() {
        int res = gm.updateGoods();
        return res+"";
    }
}
