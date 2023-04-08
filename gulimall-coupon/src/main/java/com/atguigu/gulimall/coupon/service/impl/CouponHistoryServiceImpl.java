package com.atguigu.gulimall.coupon.service.impl;

import com.atguigu.gulimall.coupon.entity.CouponHistoryEntity;
import com.atguigu.gulimall.coupon.mapper.CouponHistoryMapper;
import com.atguigu.gulimall.coupon.service.CouponHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 优惠券领取历史记录(CouponHistory)表服务实现类
 *
 * @author makejava
 * @since 2023-04-08 21:45:38
 */
@Service("couponHistoryService")
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryMapper, CouponHistoryEntity> implements CouponHistoryService {

}

