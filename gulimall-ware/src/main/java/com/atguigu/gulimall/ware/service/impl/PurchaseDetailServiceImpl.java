package com.atguigu.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.atguigu.gulimall.ware.entity.PurchaseDetailEntity;
import com.atguigu.gulimall.ware.mapper.PurchaseDetailMapper;
import com.atguigu.gulimall.ware.service.PurchaseDetailService;

/**
 * (PurchaseDetail)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 21:23:38
 */
@Service("purchaseDetailService")
public class PurchaseDetailServiceImpl extends ServiceImpl<PurchaseDetailMapper, PurchaseDetailEntity> implements PurchaseDetailService {

}

