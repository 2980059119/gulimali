package com.atguigu.gulimall.member.service.impl;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.atguigu.gulimall.member.mapper.MemberMapper;
import com.atguigu.gulimall.member.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 会员(Member)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 20:54:48
 */
@Service("memberService")
public class MemberServiceImpl extends ServiceImpl<MemberMapper, MemberEntity> implements MemberService {

}

