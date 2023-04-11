package com.atguigu.gulimall.member.service.impl;

import com.atguigu.gulimall.member.entity.GrowthChangeHistoryEntity;
import com.atguigu.gulimall.member.mapper.GrowthChangeHistoryMapper;
import com.atguigu.gulimall.member.service.GrowthChangeHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 成长值变化历史记录(GrowthChangeHistory)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 20:54:48
 */
@Service("growthChangeHistoryService")
public class GrowthChangeHistoryServiceImpl extends ServiceImpl<GrowthChangeHistoryMapper, GrowthChangeHistoryEntity> implements GrowthChangeHistoryService {

}

