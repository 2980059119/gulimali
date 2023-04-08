package com.atguigu.gulimall.coupon.service.impl;

import com.atguigu.gulimall.coupon.entity.CouponSpuRelationEntity;
import com.atguigu.gulimall.coupon.mapper.CouponSpuRelationMapper;
import com.atguigu.gulimall.coupon.service.CouponSpuRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 优惠券与产品关联(CouponSpuRelation)表服务实现类
 *
 * @author makejava
 * @since 2023-04-08 21:45:38
 */
@Service("couponSpuRelationService")
public class CouponSpuRelationServiceImpl extends ServiceImpl<CouponSpuRelationMapper, CouponSpuRelationEntity> implements CouponSpuRelationService {

}

