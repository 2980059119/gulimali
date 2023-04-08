package com.atguigu.gulimall.coupon.controller;


import com.atguigu.gulimall.coupon.entity.CouponHistoryEntity;
import com.atguigu.gulimall.coupon.service.CouponHistoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 优惠券领取历史记录(CouponHistory)表控制层
 *
 * @author makejava
 * @since 2023-04-08 21:45:38
 */
@RestController
@RequestMapping("couponHistory")
public class CouponHistoryController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private CouponHistoryService couponHistoryService;

    /**
     * 分页查询所有数据
     *
     * @param page          分页对象
     * @param couponHistory 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<CouponHistoryEntity> page, CouponHistoryEntity couponHistory) {
        return success(this.couponHistoryService.page(page, new QueryWrapper<>(couponHistory)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.couponHistoryService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param couponHistory 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody CouponHistoryEntity couponHistory) {
        return success(this.couponHistoryService.save(couponHistory));
    }

    /**
     * 修改数据
     *
     * @param couponHistory 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody CouponHistoryEntity couponHistory) {
        return success(this.couponHistoryService.updateById(couponHistory));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.couponHistoryService.removeByIds(idList));
    }
}

