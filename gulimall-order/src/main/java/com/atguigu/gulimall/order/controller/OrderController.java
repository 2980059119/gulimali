package com.atguigu.gulimall.order.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.atguigu.gulimall.order.entity.OrderEntity;
import com.atguigu.gulimall.order.service.OrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 订单(Order)表控制层
 *
 * @author makejava
 * @since 2023-04-11 21:12:27
 */
@RestController
@RequestMapping("order")
public class OrderController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;

    /**
     * 分页查询所有数据
     *
     * @param page  分页对象
     * @param order 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<OrderEntity> page, OrderEntity order) {
        return success(this.orderService.page(page, new QueryWrapper<>(order)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.orderService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param order 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody OrderEntity order) {
        return success(this.orderService.save(order));
    }

    /**
     * 修改数据
     *
     * @param order 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody OrderEntity order) {
        return success(this.orderService.updateById(order));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.orderService.removeByIds(idList));
    }
}

