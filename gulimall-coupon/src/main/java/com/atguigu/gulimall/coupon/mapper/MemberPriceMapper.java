package com.atguigu.gulimall.coupon.mapper;

import com.atguigu.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
 * 商品会员价格(MemberPrice)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-08 21:45:39
 */
@Mapper
public interface MemberPriceMapper extends BaseMapper<MemberPriceEntity> {

}

