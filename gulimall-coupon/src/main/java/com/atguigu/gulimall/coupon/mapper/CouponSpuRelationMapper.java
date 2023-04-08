package com.atguigu.gulimall.coupon.mapper;

import com.atguigu.gulimall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
 * 优惠券与产品关联(CouponSpuRelation)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-08 21:45:38
 */
@Mapper
public interface CouponSpuRelationMapper extends BaseMapper<CouponSpuRelationEntity> {

}

