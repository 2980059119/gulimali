package com.atguigu.gulimall.member.mapper;

import com.atguigu.gulimall.member.entity.MemberReceiveAddressEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
 * 会员收货地址(MemberReceiveAddress)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 20:54:50
 */
@Mapper
public interface MemberReceiveAddressMapper extends BaseMapper<MemberReceiveAddressEntity> {

}

