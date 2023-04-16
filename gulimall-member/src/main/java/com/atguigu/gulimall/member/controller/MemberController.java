package com.atguigu.gulimall.member.controller;


import com.atguigu.gulimall.member.entity.MemberEntity;
import com.atguigu.gulimall.member.feign.CouponFeignService;
import com.atguigu.gulimall.member.service.MemberService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * 会员(Member)表控制层
 *
 * @author makejava
 * @since 2023-04-11 20:54:48
 */
@RestController
@RequestMapping("member")
public class MemberController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private MemberService memberService;
    @Resource
    private CouponFeignService couponFeignService;

    @RequestMapping("/coupons")
    public R test() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("张三");
        R menbercoupons = couponFeignService.menbercoupons();

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("member", memberEntity);
        hashMap.put("coupons", menbercoupons.getData());
        return R.ok(hashMap);
    }

    /**
     * 分页查询所有数据
     *
     * @param page   分页对象
     * @param member 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<MemberEntity> page, MemberEntity member) {
        return success(this.memberService.page(page, new QueryWrapper<>(member)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.memberService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param member 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody MemberEntity member) {
        return success(this.memberService.save(member));
    }

    /**
     * 修改数据
     *
     * @param member 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody MemberEntity member) {
        return success(this.memberService.updateById(member));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.memberService.removeByIds(idList));
    }
}

