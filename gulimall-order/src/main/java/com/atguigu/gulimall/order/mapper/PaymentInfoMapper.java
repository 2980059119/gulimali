package com.atguigu.gulimall.order.mapper;

import com.atguigu.gulimall.order.entity.PaymentInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


/**
 * 支付信息表(PaymentInfo)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 21:12:29
 */
@Mapper
public interface PaymentInfoMapper extends BaseMapper<PaymentInfoEntity> {

}

