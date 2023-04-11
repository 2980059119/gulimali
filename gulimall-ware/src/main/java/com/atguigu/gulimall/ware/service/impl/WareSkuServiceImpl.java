package com.atguigu.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.atguigu.gulimall.ware.mapper.WareSkuMapper;
import com.atguigu.gulimall.ware.service.WareSkuService;

/**
 * 商品库存(WareSku)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 21:23:39
 */
@Service("wareSkuService")
public class WareSkuServiceImpl extends ServiceImpl<WareSkuMapper, WareSkuEntity> implements WareSkuService {

}

