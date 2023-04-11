package com.atguigu.gulimall.ware.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atguigu.gulimall.ware.entity.PurchaseEntity;

/**
 * 采购信息(Purchase)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 21:23:37
 */
@Mapper
public interface PurchaseMapper extends BaseMapper<PurchaseEntity> {

}

