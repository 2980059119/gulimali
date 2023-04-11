package com.atguigu.gulimall.order.mapper;

import com.atguigu.gulimall.order.entity.OrderSettingEntity;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


/**
 * 订单配置信息(OrderSetting)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 21:12:29
 */
@Mapper
public interface OrderSettingMapper extends BaseMapper<OrderSettingEntity> {

}

