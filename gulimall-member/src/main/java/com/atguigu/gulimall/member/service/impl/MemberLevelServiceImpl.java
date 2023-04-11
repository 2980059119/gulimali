package com.atguigu.gulimall.member.service.impl;

import com.atguigu.gulimall.member.entity.MemberLevelEntity;
import com.atguigu.gulimall.member.mapper.MemberLevelMapper;
import com.atguigu.gulimall.member.service.MemberLevelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 会员等级(MemberLevel)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 20:54:49
 */
@Service("memberLevelService")
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelMapper, MemberLevelEntity> implements MemberLevelService {

}

