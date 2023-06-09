package com.atguigu.gulimall.coupon.controller;


import com.atguigu.gulimall.coupon.entity.CouponSpuRelationEntity;
import com.atguigu.gulimall.coupon.service.CouponSpuRelationService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 优惠券与产品关联(CouponSpuRelation)表控制层
 *
 * @author makejava
 * @since 2023-04-08 21:45:38
 */
@RestController
@RequestMapping("couponSpuRelation")
public class CouponSpuRelationController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private CouponSpuRelationService couponSpuRelationService;

    /**
     * 分页查询所有数据
     *
     * @param page              分页对象
     * @param couponSpuRelation 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<CouponSpuRelationEntity> page, CouponSpuRelationEntity couponSpuRelation) {
        return success(this.couponSpuRelationService.page(page, new QueryWrapper<>(couponSpuRelation)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.couponSpuRelationService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param couponSpuRelation 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody CouponSpuRelationEntity couponSpuRelation) {
        return success(this.couponSpuRelationService.save(couponSpuRelation));
    }

    /**
     * 修改数据
     *
     * @param couponSpuRelation 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody CouponSpuRelationEntity couponSpuRelation) {
        return success(this.couponSpuRelationService.updateById(couponSpuRelation));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.couponSpuRelationService.removeByIds(idList));
    }
}

