package com.atguigu.gulimall.order.mapper;

import com.atguigu.gulimall.order.entity.OrderReturnReasonEntity;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


/**
 * 退货原因(OrderReturnReason)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 21:12:29
 */
@Mapper
public interface OrderReturnReasonMapper extends BaseMapper<OrderReturnReasonEntity> {

}

