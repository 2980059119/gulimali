package com.atguigu.gulimall.ware.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.atguigu.gulimall.ware.entity.WareOrderTaskDetailEntity;
import com.atguigu.gulimall.ware.service.WareOrderTaskDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 库存工作单(WareOrderTaskDetail)表控制层
 *
 * @author makejava
 * @since 2023-04-11 21:23:38
 */
@RestController
@RequestMapping("wareOrderTaskDetail")
public class WareOrderTaskDetailController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private WareOrderTaskDetailService wareOrderTaskDetailService;

    /**
     * 分页查询所有数据
     *
     * @param page                分页对象
     * @param wareOrderTaskDetail 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<WareOrderTaskDetailEntity> page, WareOrderTaskDetailEntity wareOrderTaskDetail) {
        return success(this.wareOrderTaskDetailService.page(page, new QueryWrapper<>(wareOrderTaskDetail)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.wareOrderTaskDetailService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param wareOrderTaskDetail 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody WareOrderTaskDetailEntity wareOrderTaskDetail) {
        return success(this.wareOrderTaskDetailService.save(wareOrderTaskDetail));
    }

    /**
     * 修改数据
     *
     * @param wareOrderTaskDetail 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody WareOrderTaskDetailEntity wareOrderTaskDetail) {
        return success(this.wareOrderTaskDetailService.updateById(wareOrderTaskDetail));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.wareOrderTaskDetailService.removeByIds(idList));
    }
}

