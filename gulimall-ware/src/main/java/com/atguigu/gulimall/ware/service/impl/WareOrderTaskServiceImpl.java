package com.atguigu.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.atguigu.gulimall.ware.entity.WareOrderTaskEntity;
import com.atguigu.gulimall.ware.mapper.WareOrderTaskMapper;
import com.atguigu.gulimall.ware.service.WareOrderTaskService;

/**
 * 库存工作单(WareOrderTask)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 21:23:38
 */
@Service("wareOrderTaskService")
public class WareOrderTaskServiceImpl extends ServiceImpl<WareOrderTaskMapper, WareOrderTaskEntity> implements WareOrderTaskService {

}

