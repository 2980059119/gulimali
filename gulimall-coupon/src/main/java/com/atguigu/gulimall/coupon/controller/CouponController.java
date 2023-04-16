package com.atguigu.gulimall.coupon.controller;


import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.atguigu.gulimall.coupon.service.CouponService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * 优惠券信息(Coupon)表控制层
 *
 * @author makejava
 * @since 2023-04-08 21:45:37
 */
@RestController
@RequestMapping("coupon")
@RefreshScope
public class CouponController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private CouponService couponService;

    @Value("${coupon.user.name}")
    private String name;
    @Value("${coupon.user.age}")
    private Integer age;

    @RequestMapping("/test")
    public R test() {
        return R.ok("name:" + name + "==age:" + age);
    }

    @RequestMapping("/member/list")
    public R menbercoupons() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满100减10");
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("coupons", couponEntity);
        return R.ok(hashMap);
    }

    /**
     * 分页查询所有数据
     *
     * @param page   分页对象
     * @param coupon 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<CouponEntity> page, CouponEntity coupon) {
        return success(this.couponService.page(page, new QueryWrapper<>(coupon)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.couponService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param coupon 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody CouponEntity coupon) {
        return success(this.couponService.save(coupon));
    }

    /**
     * 修改数据
     *
     * @param coupon 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody CouponEntity coupon) {
        return success(this.couponService.updateById(coupon));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.couponService.removeByIds(idList));
    }
}

