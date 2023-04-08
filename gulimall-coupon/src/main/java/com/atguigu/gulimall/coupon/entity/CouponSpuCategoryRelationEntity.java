package com.atguigu.gulimall.coupon.entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 优惠券分类关联(CouponSpuCategoryRelation)表实体类
 *
 * @author makejava
 * @since 2023-04-08 21:45:38
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelationEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * 优惠券id
     */
    private Long couponId;
    /**
     * 产品分类id
     */
    private Long categoryId;
    /**
     * 产品分类名称
     */
    private String categoryName;


}

