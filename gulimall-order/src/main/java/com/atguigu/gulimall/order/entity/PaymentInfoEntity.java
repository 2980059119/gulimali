package com.atguigu.gulimall.order.entity;

import java.util.Date;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 支付信息表(PaymentInfo)表实体类
 *
 * @author makejava
 * @since 2023-04-11 21:12:29
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_payment_info")
public class PaymentInfoEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * 订单号（对外业务号）
     */
    private String orderSn;
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 支付宝交易流水号
     */
    private String alipayTradeNo;
    /**
     * 支付总金额
     */
    private Double totalAmount;
    /**
     * 交易内容
     */
    private String subject;
    /**
     * 支付状态
     */
    private String paymentStatus;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 确认时间
     */
    private Date confirmTime;
    /**
     * 回调内容
     */
    private String callbackContent;
    /**
     * 回调时间
     */
    private Date callbackTime;


}

