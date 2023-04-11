package com.atguigu.gulimall.ware.entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * (PurchaseDetail)表实体类
 *
 * @author makejava
 * @since 2023-04-11 21:23:38
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity {
    @TableId
    private Long id;

    /**
     * 采购单id
     */
    private Long purchaseId;
    /**
     * 采购商品id
     */
    private Long skuId;
    /**
     * 采购数量
     */
    private Integer skuNum;
    /**
     * 采购金额
     */
    private Double skuPrice;
    /**
     * 仓库id
     */
    private Long wareId;
    /**
     * 状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
     */
    private Integer status;


}

