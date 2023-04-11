package com.atguigu.gulimall.member.mapper;

import com.atguigu.gulimall.member.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
 * 成长值变化历史记录(GrowthChangeHistory)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 20:54:47
 */
@Mapper
public interface GrowthChangeHistoryMapper extends BaseMapper<GrowthChangeHistoryEntity> {

}

