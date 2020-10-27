package com.mybatis.mi.entity;

import java.util.Date;

public class Cate {
    /**
     *
     */
    private Integer cateId;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private Date createDate;

    /**
     *
     */
    private Byte status;

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}

