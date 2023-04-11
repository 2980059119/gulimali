package com.atguigu.gulimall.member.service.impl;

import com.atguigu.gulimall.member.entity.MemberReceiveAddressEntity;
import com.atguigu.gulimall.member.mapper.MemberReceiveAddressMapper;
import com.atguigu.gulimall.member.service.MemberReceiveAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 会员收货地址(MemberReceiveAddress)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 20:54:50
 */
@Service("memberReceiveAddressService")
public class MemberReceiveAddressServiceImpl extends ServiceImpl<MemberReceiveAddressMapper, MemberReceiveAddressEntity> implements MemberReceiveAddressService {

}

