package com.mybatis.mi.mapper;

import com.mybatis.mi.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //增删改--int (User) 查--User
    int insert(@Param("user") User user);
    User selectById(@Param("userId") int userId);
    int update(@Param("user") User user);
}

