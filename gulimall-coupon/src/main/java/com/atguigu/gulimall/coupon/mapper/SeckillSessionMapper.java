package com.atguigu.gulimall.coupon.mapper;

import com.atguigu.gulimall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
 * 秒杀活动场次(SeckillSession)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-08 21:45:40
 */
@Mapper
public interface SeckillSessionMapper extends BaseMapper<SeckillSessionEntity> {

}

