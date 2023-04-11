package com.atguigu.gulimall.order.service.impl;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.atguigu.gulimall.order.mapper.OrderItemMapper;
import com.atguigu.gulimall.order.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 订单项信息(OrderItem)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 21:12:28
 */
@Service("orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItemEntity> implements OrderItemService {

}

