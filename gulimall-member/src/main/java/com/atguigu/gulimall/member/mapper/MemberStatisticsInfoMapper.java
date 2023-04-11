package com.atguigu.gulimall.member.mapper;

import com.atguigu.gulimall.member.entity.MemberStatisticsInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
 * 会员统计信息(MemberStatisticsInfo)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 20:54:50
 */
@Mapper
public interface MemberStatisticsInfoMapper extends BaseMapper<MemberStatisticsInfoEntity> {

}

