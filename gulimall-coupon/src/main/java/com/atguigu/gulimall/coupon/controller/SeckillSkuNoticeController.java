package com.atguigu.gulimall.coupon.controller;


import com.atguigu.gulimall.coupon.entity.SeckillSkuNoticeEntity;
import com.atguigu.gulimall.coupon.service.SeckillSkuNoticeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 秒杀商品通知订阅(SeckillSkuNotice)表控制层
 *
 * @author makejava
 * @since 2023-04-08 21:45:40
 */
@RestController
@RequestMapping("seckillSkuNotice")
public class SeckillSkuNoticeController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SeckillSkuNoticeService seckillSkuNoticeService;

    /**
     * 分页查询所有数据
     *
     * @param page             分页对象
     * @param seckillSkuNotice 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SeckillSkuNoticeEntity> page, SeckillSkuNoticeEntity seckillSkuNotice) {
        return success(this.seckillSkuNoticeService.page(page, new QueryWrapper<>(seckillSkuNotice)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.seckillSkuNoticeService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param seckillSkuNotice 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SeckillSkuNoticeEntity seckillSkuNotice) {
        return success(this.seckillSkuNoticeService.save(seckillSkuNotice));
    }

    /**
     * 修改数据
     *
     * @param seckillSkuNotice 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SeckillSkuNoticeEntity seckillSkuNotice) {
        return success(this.seckillSkuNoticeService.updateById(seckillSkuNotice));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.seckillSkuNoticeService.removeByIds(idList));
    }
}

