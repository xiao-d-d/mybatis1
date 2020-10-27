package com.mybatis.mi.entity;

import java.util.Date;

public class Order {
    /**
     *
     */
    private Integer orderId;
    /**
     * 订单号
     */
    private Integer orderNo;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 0未支付1支付
     */
    private Integer status;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Date getcreateDate() {
        return createDate;
    }

    public void setcreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderNo=" + orderNo +
                ", createDate=" + createDate +
                ", userId=" + userId +
                ", status=" + status +
                '}';
    }
}

