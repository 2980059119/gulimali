package com.atguigu.gulimall.ware.entity;

import java.util.Date;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 采购信息(Purchase)表实体类
 *
 * @author makejava
 * @since 2023-04-11 21:23:37
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("wms_purchase")
public class PurchaseEntity {
    /**
     * 采购单id
     */
    @TableId
    private Long id;

    /**
     * 采购人id
     */
    private Long assigneeId;
    /**
     * 采购人名
     */
    private String assigneeName;
    /**
     * 联系方式
     */
    private String phone;
    /**
     * 优先级
     */
    private Integer priority;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 仓库id
     */
    private Long wareId;
    /**
     * 总金额
     */
    private Double amount;
    /**
     * 创建日期
     */
    private Date createTime;
    /**
     * 更新日期
     */
    private Date updateTime;


}

