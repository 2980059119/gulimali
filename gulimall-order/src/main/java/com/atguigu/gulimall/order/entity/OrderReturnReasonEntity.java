package com.atguigu.gulimall.order.entity;

import java.util.Date;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 退货原因(OrderReturnReason)表实体类
 *
 * @author makejava
 * @since 2023-04-11 21:12:29
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_order_return_reason")
public class OrderReturnReasonEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * 退货原因名
     */
    private String name;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 启用状态
     */
    private Integer status;
    /**
     * create_time
     */
    private Date createTime;


}

