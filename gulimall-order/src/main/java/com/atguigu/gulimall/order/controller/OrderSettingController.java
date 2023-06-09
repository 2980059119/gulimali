package com.atguigu.gulimall.order.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.atguigu.gulimall.order.entity.OrderSettingEntity;
import com.atguigu.gulimall.order.service.OrderSettingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 订单配置信息(OrderSetting)表控制层
 *
 * @author makejava
 * @since 2023-04-11 21:12:29
 */
@RestController
@RequestMapping("orderSetting")
public class OrderSettingController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private OrderSettingService orderSettingService;

    /**
     * 分页查询所有数据
     *
     * @param page         分页对象
     * @param orderSetting 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<OrderSettingEntity> page, OrderSettingEntity orderSetting) {
        return success(this.orderSettingService.page(page, new QueryWrapper<>(orderSetting)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.orderSettingService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param orderSetting 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody OrderSettingEntity orderSetting) {
        return success(this.orderSettingService.save(orderSetting));
    }

    /**
     * 修改数据
     *
     * @param orderSetting 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody OrderSettingEntity orderSetting) {
        return success(this.orderSettingService.updateById(orderSetting));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.orderSettingService.removeByIds(idList));
    }
}

