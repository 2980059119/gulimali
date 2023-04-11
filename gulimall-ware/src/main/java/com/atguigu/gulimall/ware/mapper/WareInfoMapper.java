package com.atguigu.gulimall.ware.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atguigu.gulimall.ware.entity.WareInfoEntity;

/**
 * 仓库信息(WareInfo)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-11 21:23:38
 */
@Mapper
public interface WareInfoMapper extends BaseMapper<WareInfoEntity> {

}

