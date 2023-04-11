package com.atguigu.gulimall.order.entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 退款信息(RefundInfo)表实体类
 *
 * @author makejava
 * @since 2023-04-11 21:12:30
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_refund_info")
public class RefundInfoEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * 退款的订单
     */
    private Long orderReturnId;
    /**
     * 退款金额
     */
    private Double refund;
    /**
     * 退款交易流水号
     */
    private String refundSn;
    /**
     * 退款状态
     */
    private Integer refundStatus;
    /**
     * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
     */
    private Integer refundChannel;
    private String refundContent;


}

