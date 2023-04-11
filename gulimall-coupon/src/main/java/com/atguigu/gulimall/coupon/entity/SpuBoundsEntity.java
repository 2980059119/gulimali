package com.atguigu.gulimall.coupon.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 商品spu积分设置(SpuBounds)表实体类
 *
 * @author makejava
 * @since 2023-04-08 21:45:41
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_spu_bounds")
public class SpuBoundsEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    private Long spuId;
    /**
     * 成长积分
     */
    private Double growBounds;
    /**
     * 购物积分
     */
    private Double buyBounds;
    /**
     * 优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
     */
    private Integer work;


}

