package com.atguigu.gulimall.order.service.impl;

import com.atguigu.gulimall.order.entity.OrderReturnReasonEntity;
import com.atguigu.gulimall.order.mapper.OrderReturnReasonMapper;
import com.atguigu.gulimall.order.service.OrderReturnReasonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 退货原因(OrderReturnReason)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 21:12:29
 */
@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonMapper, OrderReturnReasonEntity> implements OrderReturnReasonService {

}

