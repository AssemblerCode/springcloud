package com.mashibing.seata;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayMapper {
    int payment(@Param("id") Integer id);
}
