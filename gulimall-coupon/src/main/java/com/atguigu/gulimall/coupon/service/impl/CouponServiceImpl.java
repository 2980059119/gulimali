package com.atguigu.gulimall.coupon.service.impl;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.atguigu.gulimall.coupon.mapper.CouponMapper;
import com.atguigu.gulimall.coupon.service.CouponService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 优惠券信息(Coupon)表服务实现类
 *
 * @author makejava
 * @since 2023-04-08 21:45:37
 */
@Service("couponService")
public class CouponServiceImpl extends ServiceImpl<CouponMapper, CouponEntity> implements CouponService {

}

