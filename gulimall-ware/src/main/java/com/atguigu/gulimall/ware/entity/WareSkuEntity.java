package com.atguigu.gulimall.ware.entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 商品库存(WareSku)表实体类
 *
 * @author makejava
 * @since 2023-04-11 21:23:39
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("wms_ware_sku")
public class WareSkuEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * sku_id
     */
    private Long skuId;
    /**
     * 仓库id
     */
    private Long wareId;
    /**
     * 库存数
     */
    private Integer stock;
    /**
     * sku_name
     */
    private String skuName;
    /**
     * 锁定库存
     */
    private Integer stockLocked;


}

