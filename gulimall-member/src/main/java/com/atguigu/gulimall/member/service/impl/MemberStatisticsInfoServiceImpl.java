package com.atguigu.gulimall.member.service.impl;

import com.atguigu.gulimall.member.entity.MemberStatisticsInfoEntity;
import com.atguigu.gulimall.member.mapper.MemberStatisticsInfoMapper;
import com.atguigu.gulimall.member.service.MemberStatisticsInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 会员统计信息(MemberStatisticsInfo)表服务实现类
 *
 * @author makejava
 * @since 2023-04-11 20:54:50
 */
@Service("memberStatisticsInfoService")
public class MemberStatisticsInfoServiceImpl extends ServiceImpl<MemberStatisticsInfoMapper, MemberStatisticsInfoEntity> implements MemberStatisticsInfoService {

}

