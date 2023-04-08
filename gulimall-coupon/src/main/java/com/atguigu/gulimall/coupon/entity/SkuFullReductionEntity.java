package com.atguigu.gulimall.coupon.entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 商品满减信息(SkuFullReduction)表实体类
 *
 * @author makejava
 * @since 2023-04-08 21:45:41
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_sku_full_reduction")
public class SkuFullReductionEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * spu_id
     */
    private Long skuId;
    /**
     * 满多少
     */
    private Double fullPrice;
    /**
     * 减多少
     */
    private Double reducePrice;
    /**
     * 是否参与其他优惠
     */
    private Integer addOther;


}

