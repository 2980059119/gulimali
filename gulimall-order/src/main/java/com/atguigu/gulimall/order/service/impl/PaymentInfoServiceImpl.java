package com.atguigu.gulimall.order.service.impl;

import com.atguigu.gulimall.order.entity.PaymentInfoEntity;
import com.atguigu.gulimall.order.mapper.PaymentInfoMapper;
import com.atguigu.gulimall.order.service.PaymentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 支付信息表(PaymentInfo)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 21:12:29
 */
@Service("paymentInfoService")
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfoEntity> implements PaymentInfoService {

}

