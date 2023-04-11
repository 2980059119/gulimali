package com.atguigu.gulimall.coupon.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 商品阶梯价格(SkuLadder)表实体类
 *
 * @author makejava
 * @since 2023-04-08 21:45:41
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_sku_ladder")
public class SkuLadderEntity {
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
     * 满几件
     */
    private Integer fullCount;
    /**
     * 打几折
     */
    private Double discount;
    /**
     * 折后价
     */
    private Double price;
    /**
     * 是否叠加其他优惠[0-不可叠加，1-可叠加]
     */
    private Integer addOther;


}

