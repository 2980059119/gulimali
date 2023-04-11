package com.atguigu.gulimall.order.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.atguigu.gulimall.order.entity.OrderReturnReasonEntity;
import com.atguigu.gulimall.order.service.OrderReturnReasonService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 退货原因(OrderReturnReason)表控制层
 *
 * @author makejava
 * @since 2023-04-11 21:12:29
 */
@RestController
@RequestMapping("orderReturnReason")
public class OrderReturnReasonController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private OrderReturnReasonService orderReturnReasonService;

    /**
     * 分页查询所有数据
     *
     * @param page              分页对象
     * @param orderReturnReason 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<OrderReturnReasonEntity> page, OrderReturnReasonEntity orderReturnReason) {
        return success(this.orderReturnReasonService.page(page, new QueryWrapper<>(orderReturnReason)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.orderReturnReasonService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param orderReturnReason 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody OrderReturnReasonEntity orderReturnReason) {
        return success(this.orderReturnReasonService.save(orderReturnReason));
    }

    /**
     * 修改数据
     *
     * @param orderReturnReason 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody OrderReturnReasonEntity orderReturnReason) {
        return success(this.orderReturnReasonService.updateById(orderReturnReason));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.orderReturnReasonService.removeByIds(idList));
    }
}

