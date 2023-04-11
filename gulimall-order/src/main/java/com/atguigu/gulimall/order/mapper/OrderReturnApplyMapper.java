package com.atguigu.gulimall.order.mapper;

import com.atguigu.gulimall.order.entity.OrderReturnApplyEntity;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


/**
 * 订单退货申请(OrderReturnApply)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 21:12:28
 */
@Mapper
public interface OrderReturnApplyMapper extends BaseMapper<OrderReturnApplyEntity> {

}

