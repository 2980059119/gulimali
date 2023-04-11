package com.atguigu.gulimall.ware.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.atguigu.gulimall.ware.entity.PurchaseEntity;
import com.atguigu.gulimall.ware.service.PurchaseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 采购信息(Purchase)表控制层
 *
 * @author makejava
 * @since 2023-04-11 21:23:37
 */
@RestController
@RequestMapping("purchase")
public class PurchaseController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private PurchaseService purchaseService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param purchase 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<PurchaseEntity> page, PurchaseEntity purchase) {
        return success(this.purchaseService.page(page, new QueryWrapper<>(purchase)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.purchaseService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param purchase 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody PurchaseEntity purchase) {
        return success(this.purchaseService.save(purchase));
    }

    /**
     * 修改数据
     *
     * @param purchase 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody PurchaseEntity purchase) {
        return success(this.purchaseService.updateById(purchase));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.purchaseService.removeByIds(idList));
    }
}

