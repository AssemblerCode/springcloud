package com.mashibing.service;

import io.seata.spring.annotation.GlobalTransactional;

public interface PayService {
    @GlobalTransactional
    Integer payment();
}
