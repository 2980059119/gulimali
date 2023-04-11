package com.atguigu.gulimall.ware.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atguigu.gulimall.ware.entity.WareSkuEntity;

/**
 * 商品库存(WareSku)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 21:23:39
 */
@Mapper
public interface WareSkuMapper extends BaseMapper<WareSkuEntity> {

}

