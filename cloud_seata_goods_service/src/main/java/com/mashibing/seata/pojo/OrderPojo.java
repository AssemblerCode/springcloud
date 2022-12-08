package com.mashibing.seata.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class OrderPojo {
    private Integer id;
    private Date createTime;
    private Integer status;
}
