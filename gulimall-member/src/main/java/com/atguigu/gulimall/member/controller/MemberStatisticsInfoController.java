package com.atguigu.gulimall.member.controller;


import com.atguigu.gulimall.member.entity.MemberStatisticsInfoEntity;
import com.atguigu.gulimall.member.service.MemberStatisticsInfoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 会员统计信息(MemberStatisticsInfo)表控制层
 *
 * @author makejava
 * @since 2023-04-11 20:54:50
 */
@RestController
@RequestMapping("memberStatisticsInfo")
public class MemberStatisticsInfoController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private MemberStatisticsInfoService memberStatisticsInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page                 分页对象
     * @param memberStatisticsInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<MemberStatisticsInfoEntity> page, MemberStatisticsInfoEntity memberStatisticsInfo) {
        return success(this.memberStatisticsInfoService.page(page, new QueryWrapper<>(memberStatisticsInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.memberStatisticsInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param memberStatisticsInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody MemberStatisticsInfoEntity memberStatisticsInfo) {
        return success(this.memberStatisticsInfoService.save(memberStatisticsInfo));
    }

    /**
     * 修改数据
     *
     * @param memberStatisticsInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody MemberStatisticsInfoEntity memberStatisticsInfo) {
        return success(this.memberStatisticsInfoService.updateById(memberStatisticsInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.memberStatisticsInfoService.removeByIds(idList));
    }
}

