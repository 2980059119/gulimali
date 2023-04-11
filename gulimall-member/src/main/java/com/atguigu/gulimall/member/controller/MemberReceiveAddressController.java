package com.atguigu.gulimall.member.controller;


import com.atguigu.gulimall.member.entity.MemberReceiveAddressEntity;
import com.atguigu.gulimall.member.service.MemberReceiveAddressService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 会员收货地址(MemberReceiveAddress)表控制层
 *
 * @author makejava
 * @since 2023-04-11 20:54:50
 */
@RestController
@RequestMapping("memberReceiveAddress")
public class MemberReceiveAddressController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private MemberReceiveAddressService memberReceiveAddressService;

    /**
     * 分页查询所有数据
     *
     * @param page                 分页对象
     * @param memberReceiveAddress 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<MemberReceiveAddressEntity> page, MemberReceiveAddressEntity memberReceiveAddress) {
        return success(this.memberReceiveAddressService.page(page, new QueryWrapper<>(memberReceiveAddress)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.memberReceiveAddressService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param memberReceiveAddress 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody MemberReceiveAddressEntity memberReceiveAddress) {
        return success(this.memberReceiveAddressService.save(memberReceiveAddress));
    }

    /**
     * 修改数据
     *
     * @param memberReceiveAddress 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody MemberReceiveAddressEntity memberReceiveAddress) {
        return success(this.memberReceiveAddressService.updateById(memberReceiveAddress));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.memberReceiveAddressService.removeByIds(idList));
    }
}

