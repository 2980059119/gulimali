package com.atguigu.gulimall.ware.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.atguigu.gulimall.ware.entity.WareInfoEntity;
import com.atguigu.gulimall.ware.service.WareInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 仓库信息(WareInfo)表控制层
 *
 * @author makejava
 * @since 2023-04-11 21:23:38
 */
@RestController
@RequestMapping("wareInfo")
public class WareInfoController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private WareInfoService wareInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param wareInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<WareInfoEntity> page, WareInfoEntity wareInfo) {
        return success(this.wareInfoService.page(page, new QueryWrapper<>(wareInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.wareInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param wareInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody WareInfoEntity wareInfo) {
        return success(this.wareInfoService.save(wareInfo));
    }

    /**
     * 修改数据
     *
     * @param wareInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody WareInfoEntity wareInfo) {
        return success(this.wareInfoService.updateById(wareInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.wareInfoService.removeByIds(idList));
    }
}

