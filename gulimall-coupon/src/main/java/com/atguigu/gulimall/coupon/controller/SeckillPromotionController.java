package com.atguigu.gulimall.coupon.controller;


import com.atguigu.gulimall.coupon.entity.SeckillPromotionEntity;
import com.atguigu.gulimall.coupon.service.SeckillPromotionService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 秒杀活动(SeckillPromotion)表控制层
 *
 * @author makejava
 * @since 2023-04-08 21:45:40
 */
@RestController
@RequestMapping("seckillPromotion")
public class SeckillPromotionController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SeckillPromotionService seckillPromotionService;

    /**
     * 分页查询所有数据
     *
     * @param page             分页对象
     * @param seckillPromotion 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SeckillPromotionEntity> page, SeckillPromotionEntity seckillPromotion) {
        return success(this.seckillPromotionService.page(page, new QueryWrapper<>(seckillPromotion)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.seckillPromotionService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param seckillPromotion 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SeckillPromotionEntity seckillPromotion) {
        return success(this.seckillPromotionService.save(seckillPromotion));
    }

    /**
     * 修改数据
     *
     * @param seckillPromotion 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SeckillPromotionEntity seckillPromotion) {
        return success(this.seckillPromotionService.updateById(seckillPromotion));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.seckillPromotionService.removeByIds(idList));
    }
}

