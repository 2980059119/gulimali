package com.atguigu.gulimall.ware.entity;

import java.util.Date;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 库存工作单(WareOrderTask)表实体类
 *
 * @author makejava
 * @since 2023-04-11 21:23:38
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("wms_ware_order_task")
public class WareOrderTaskEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * order_id
     */
    private Long orderId;
    /**
     * order_sn
     */
    private String orderSn;
    /**
     * 收货人
     */
    private String consignee;
    /**
     * 收货人电话
     */
    private String consigneeTel;
    /**
     * 配送地址
     */
    private String deliveryAddress;
    /**
     * 订单备注
     */
    private String orderComment;
    /**
     * 付款方式【 1:在线付款 2:货到付款】
     */
    private Integer paymentWay;
    /**
     * 任务状态
     */
    private Integer taskStatus;
    /**
     * 订单描述
     */
    private String orderBody;
    /**
     * 物流单号
     */
    private String trackingNo;
    /**
     * create_time
     */
    private Date createTime;
    /**
     * 仓库id
     */
    private Long wareId;
    /**
     * 工作单备注
     */
    private String taskComment;


}

