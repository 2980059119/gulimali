package com.atguigu.gulimall.member.mapper;

import com.atguigu.gulimall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
 * 会员等级(MemberLevel)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 20:54:49
 */
@Mapper
public interface MemberLevelMapper extends BaseMapper<MemberLevelEntity> {

}

