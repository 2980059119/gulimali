package com.atguigu.gulimall.ware.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atguigu.gulimall.ware.entity.WareOrderTaskEntity;

/**
 * 库存工作单(WareOrderTask)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 21:23:38
 */
@Mapper
public interface WareOrderTaskMapper extends BaseMapper<WareOrderTaskEntity> {

}

