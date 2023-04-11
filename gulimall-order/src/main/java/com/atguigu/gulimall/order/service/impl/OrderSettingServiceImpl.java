package com.atguigu.gulimall.order.service.impl;

import com.atguigu.gulimall.order.entity.OrderSettingEntity;
import com.atguigu.gulimall.order.mapper.OrderSettingMapper;
import com.atguigu.gulimall.order.service.OrderSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 订单配置信息(OrderSetting)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 21:12:29
 */
@Service("orderSettingService")
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingMapper, OrderSettingEntity> implements OrderSettingService {

}

