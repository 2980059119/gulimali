package com.atguigu.gulimall.order.mapper;

import com.atguigu.gulimall.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


/**
 * 订单(Order)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 21:12:28
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {

}

