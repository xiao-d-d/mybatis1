package com.mybatis.mi.mapper;

import com.mybatis.mi.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int insert(@Param("user") User user);
    User selectById(@Param("useid") int UserId,@Param("username") String name);
}

