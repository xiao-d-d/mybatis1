package com.mybatis.mi.mapper;

import com.mybatis.mi.entity.Produc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProducMapper {
    int insert(@Param("produc") Produc produc);
    List<Produc> selectListByCate(@Param("cateId") int cateId);
}
