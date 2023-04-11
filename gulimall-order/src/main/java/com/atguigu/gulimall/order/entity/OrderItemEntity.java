package com.atguigu.gulimall.order.entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 订单项信息(OrderItem)表实体类
 *
 * @author makejava
 * @since 2023-04-11 21:12:28
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_order_item")
public class OrderItemEntity {
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
     * spu_id
     */
    private Long spuId;
    /**
     * spu_name
     */
    private String spuName;
    /**
     * spu_pic
     */
    private String spuPic;
    /**
     * 品牌
     */
    private String spuBrand;
    /**
     * 商品分类id
     */
    private Long categoryId;
    /**
     * 商品sku编号
     */
    private Long skuId;
    /**
     * 商品sku名字
     */
    private String skuName;
    /**
     * 商品sku图片
     */
    private String skuPic;
    /**
     * 商品sku价格
     */
    private Double skuPrice;
    /**
     * 商品购买的数量
     */
    private Integer skuQuantity;
    /**
     * 商品销售属性组合（JSON）
     */
    private String skuAttrsVals;
    /**
     * 商品促销分解金额
     */
    private Double promotionAmount;
    /**
     * 优惠券优惠分解金额
     */
    private Double couponAmount;
    /**
     * 积分优惠分解金额
     */
    private Double integrationAmount;
    /**
     * 该商品经过优惠后的分解金额
     */
    private Double realAmount;
    /**
     * 赠送积分
     */
    private Integer giftIntegration;
    /**
     * 赠送成长值
     */
    private Integer giftGrowth;


}

