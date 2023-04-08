package com.atguigu.gulimall.coupon.entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 商品会员价格(MemberPrice)表实体类
 *
 * @author makejava
 * @since 2023-04-08 21:45:39
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_member_price")
public class MemberPriceEntity {
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
     * 会员等级id
     */
    private Long memberLevelId;
    /**
     * 会员等级名
     */
    private String memberLevelName;
    /**
     * 会员对应价格
     */
    private Double memberPrice;
    /**
     * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
     */
    private Integer addOther;


}

