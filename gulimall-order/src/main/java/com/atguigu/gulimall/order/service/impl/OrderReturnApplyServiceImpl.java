package com.atguigu.gulimall.order.service.impl;

import com.atguigu.gulimall.order.entity.OrderReturnApplyEntity;
import com.atguigu.gulimall.order.mapper.OrderReturnApplyMapper;
import com.atguigu.gulimall.order.service.OrderReturnApplyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 订单退货申请(OrderReturnApply)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 21:12:29
 */
@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyMapper, OrderReturnApplyEntity> implements OrderReturnApplyService {

}

