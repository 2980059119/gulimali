package com.atguigu.gulimall.member.mapper;

import com.atguigu.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
 * 会员登录记录(MemberLoginLog)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 20:54:49
 */
@Mapper
public interface MemberLoginLogMapper extends BaseMapper<MemberLoginLogEntity> {

}

