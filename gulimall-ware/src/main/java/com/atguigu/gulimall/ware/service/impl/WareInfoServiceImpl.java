package com.atguigu.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.atguigu.gulimall.ware.entity.WareInfoEntity;
import com.atguigu.gulimall.ware.mapper.WareInfoMapper;
import com.atguigu.gulimall.ware.service.WareInfoService;

/**
 * 仓库信息(WareInfo)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 21:23:38
 */
@Service("wareInfoService")
public class WareInfoServiceImpl extends ServiceImpl<WareInfoMapper, WareInfoEntity> implements WareInfoService {

}

