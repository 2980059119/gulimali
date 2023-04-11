package com.atguigu.gulimall.member.mapper;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
 * 会员(Member)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 20:54:48
 */
@Mapper
public interface MemberMapper extends BaseMapper<MemberEntity> {

}

