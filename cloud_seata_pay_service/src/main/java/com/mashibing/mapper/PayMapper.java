package com.mashibing.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PayMapper {
    void payment(@Param("id") Integer id);
}
