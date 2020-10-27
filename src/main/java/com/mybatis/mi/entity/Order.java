package com.mybatis.mi.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {

    private static final long serialVersionUID=1L;
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

    private List<OrderItem> OrderItem;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<com.mybatis.mi.entity.OrderItem> getOrderItem() {
        return OrderItem;
    }

    public void setOrderItem(List<com.mybatis.mi.entity.OrderItem> orderItem) {
        OrderItem = orderItem;
    }

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

