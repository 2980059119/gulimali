package com.atguigu.gulimall.coupon.controller;


import com.atguigu.gulimall.coupon.entity.HomeAdvEntity;
import com.atguigu.gulimall.coupon.service.HomeAdvService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 首页轮播广告(HomeAdv)表控制层
 *
 * @author makejava
 * @since 2023-04-08 21:45:38
 */
@RestController
@RequestMapping("homeAdv")
public class HomeAdvController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private HomeAdvService homeAdvService;

    /**
     * 分页查询所有数据
     *
     * @param page    分页对象
     * @param homeAdv 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<HomeAdvEntity> page, HomeAdvEntity homeAdv) {
        return success(this.homeAdvService.page(page, new QueryWrapper<>(homeAdv)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.homeAdvService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param homeAdv 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody HomeAdvEntity homeAdv) {
        return success(this.homeAdvService.save(homeAdv));
    }

    /**
     * 修改数据
     *
     * @param homeAdv 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody HomeAdvEntity homeAdv) {
        return success(this.homeAdvService.updateById(homeAdv));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.homeAdvService.removeByIds(idList));
    }
}

