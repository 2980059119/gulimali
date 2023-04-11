package com.atguigu.gulimall.order.service.impl;

import com.atguigu.gulimall.order.entity.RefundInfoEntity;
import com.atguigu.gulimall.order.mapper.RefundInfoMapper;
import com.atguigu.gulimall.order.service.RefundInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 退款信息(RefundInfo)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 21:12:30
 */
@Service("refundInfoService")
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoMapper, RefundInfoEntity> implements RefundInfoService {

}

