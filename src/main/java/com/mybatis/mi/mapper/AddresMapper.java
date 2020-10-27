package com.mybatis.mi.mapper;

import com.mybatis.mi.entity.Addres;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddresMapper {
    int insert(@Param("addres") Addres addres);
    int update(Addres addres);
    List<Addres> selectListByUserId(@Param("userId") int userId);
}
