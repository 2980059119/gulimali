package com.atguigu.gulimall.order.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.atguigu.gulimall.order.entity.PaymentInfoEntity;
import com.atguigu.gulimall.order.service.PaymentInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 支付信息表(PaymentInfo)表控制层
 *
 * @author makejava
 * @since 2023-04-11 21:12:29
 */
@RestController
@RequestMapping("paymentInfo")
public class PaymentInfoController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private PaymentInfoService paymentInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page        分页对象
     * @param paymentInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<PaymentInfoEntity> page, PaymentInfoEntity paymentInfo) {
        return success(this.paymentInfoService.page(page, new QueryWrapper<>(paymentInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.paymentInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param paymentInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody PaymentInfoEntity paymentInfo) {
        return success(this.paymentInfoService.save(paymentInfo));
    }

    /**
     * 修改数据
     *
     * @param paymentInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody PaymentInfoEntity paymentInfo) {
        return success(this.paymentInfoService.updateById(paymentInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.paymentInfoService.removeByIds(idList));
    }
}

