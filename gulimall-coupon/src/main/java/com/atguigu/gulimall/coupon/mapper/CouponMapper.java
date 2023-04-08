package com.atguigu.gulimall.coupon.mapper;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
 * 优惠券信息(Coupon)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-08 21:45:37
 */
@Mapper
public interface CouponMapper extends BaseMapper<CouponEntity> {

}

