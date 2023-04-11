package com.atguigu.gulimall.member.service.impl;

import com.atguigu.gulimall.member.entity.IntegrationChangeHistoryEntity;
import com.atguigu.gulimall.member.mapper.IntegrationChangeHistoryMapper;
import com.atguigu.gulimall.member.service.IntegrationChangeHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 积分变化历史记录(IntegrationChangeHistory)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 20:54:48
 */
@Service("integrationChangeHistoryService")
public class IntegrationChangeHistoryServiceImpl extends ServiceImpl<IntegrationChangeHistoryMapper, IntegrationChangeHistoryEntity> implements IntegrationChangeHistoryService {

}

