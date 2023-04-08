package com.atguigu.gulimall.coupon.mapper;

import com.atguigu.gulimall.coupon.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(HomeSubject)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-08 21:45:39
 */
@Mapper
public interface HomeSubjectMapper extends BaseMapper<HomeSubjectEntity> {

}

