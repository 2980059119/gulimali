package com.atguigu.gulimall.member.service.impl;

import com.atguigu.gulimall.member.entity.MemberLoginLogEntity;
import com.atguigu.gulimall.member.mapper.MemberLoginLogMapper;
import com.atguigu.gulimall.member.service.MemberLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 会员登录记录(MemberLoginLog)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 20:54:50
 */
@Service("memberLoginLogService")
public class MemberLoginLogServiceImpl extends ServiceImpl<MemberLoginLogMapper, MemberLoginLogEntity> implements MemberLoginLogService {

}

