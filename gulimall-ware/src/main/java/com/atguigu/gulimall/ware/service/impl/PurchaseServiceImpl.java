package com.atguigu.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.atguigu.gulimall.ware.entity.PurchaseEntity;
import com.atguigu.gulimall.ware.mapper.PurchaseMapper;
import com.atguigu.gulimall.ware.service.PurchaseService;

/**
 * 采购信息(Purchase)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 21:23:37
 */
@Service("purchaseService")
public class PurchaseServiceImpl extends ServiceImpl<PurchaseMapper, PurchaseEntity> implements PurchaseService {

}

