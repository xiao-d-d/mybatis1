package com.mybatis.mi.mapper;

import com.mybatis.mi.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    Order selectOrderByNo(int no);
    List<Order> selectOrderByUserId(@Param("user") int userId);
}
