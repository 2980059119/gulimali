package com.atguigu.gulimall.coupon.service.impl;

import com.atguigu.gulimall.coupon.entity.CouponSpuCategoryRelationEntity;
import com.atguigu.gulimall.coupon.mapper.CouponSpuCategoryRelationMapper;
import com.atguigu.gulimall.coupon.service.CouponSpuCategoryRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 优惠券分类关联(CouponSpuCategoryRelation)表服务实现类
 *
 * @author makejava
 * @since 2023-04-08 21:45:38
 */
@Service("couponSpuCategoryRelationService")
public class CouponSpuCategoryRelationServiceImpl extends ServiceImpl<CouponSpuCategoryRelationMapper, CouponSpuCategoryRelationEntity> implements CouponSpuCategoryRelationService {

}

