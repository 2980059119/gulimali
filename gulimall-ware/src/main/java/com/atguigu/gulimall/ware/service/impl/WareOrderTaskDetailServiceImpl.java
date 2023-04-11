package com.atguigu.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.atguigu.gulimall.ware.entity.WareOrderTaskDetailEntity;
import com.atguigu.gulimall.ware.mapper.WareOrderTaskDetailMapper;
import com.atguigu.gulimall.ware.service.WareOrderTaskDetailService;

/**
 * 库存工作单(WareOrderTaskDetail)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 21:23:39
 */
@Service("wareOrderTaskDetailService")
public class WareOrderTaskDetailServiceImpl extends ServiceImpl<WareOrderTaskDetailMapper, WareOrderTaskDetailEntity> implements WareOrderTaskDetailService {

}

