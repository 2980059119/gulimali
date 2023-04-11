package com.atguigu.gulimall.ware.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atguigu.gulimall.ware.entity.PurchaseDetailEntity;

/**
 * (PurchaseDetail)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 21:23:38
 */
@Mapper
public interface PurchaseDetailMapper extends BaseMapper<PurchaseDetailEntity> {

}

