package com.atguigu.gulimall.order.mapper;

import com.atguigu.gulimall.order.entity.OrderOperateHistoryEntity;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


/**
 * 订单操作历史记录(OrderOperateHistory)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 21:12:28
 */
@Mapper
public interface OrderOperateHistoryMapper extends BaseMapper<OrderOperateHistoryEntity> {

}

