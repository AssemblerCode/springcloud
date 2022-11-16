package com.mashibing.seata.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentPojo {
    private Integer id;
    private BigDecimal account;

}
