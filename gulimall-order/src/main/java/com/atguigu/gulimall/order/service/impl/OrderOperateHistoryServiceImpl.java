package com.atguigu.gulimall.order.service.impl;

import com.atguigu.gulimall.order.entity.OrderOperateHistoryEntity;
import com.atguigu.gulimall.order.mapper.OrderOperateHistoryMapper;
import com.atguigu.gulimall.order.service.OrderOperateHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 订单操作历史记录(OrderOperateHistory)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 21:12:28
 */
@Service("orderOperateHistoryService")
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryMapper, OrderOperateHistoryEntity> implements OrderOperateHistoryService {

}

