package com.atguigu.gulimall.member.mapper;

import com.atguigu.gulimall.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
 * 积分变化历史记录(IntegrationChangeHistory)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 20:54:48
 */
@Mapper
public interface IntegrationChangeHistoryMapper extends BaseMapper<IntegrationChangeHistoryEntity> {

}

