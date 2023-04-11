package com.atguigu.gulimall.member.controller;


import com.atguigu.gulimall.member.entity.MemberCollectSubjectEntity;
import com.atguigu.gulimall.member.service.MemberCollectSubjectService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 会员收藏的专题活动(MemberCollectSubject)表控制层
 *
 * @author makejava
 * @since 2023-04-11 20:54:49
 */
@RestController
@RequestMapping("memberCollectSubject")
public class MemberCollectSubjectController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private MemberCollectSubjectService memberCollectSubjectService;

    /**
     * 分页查询所有数据
     *
     * @param page                 分页对象
     * @param memberCollectSubject 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<MemberCollectSubjectEntity> page, MemberCollectSubjectEntity memberCollectSubject) {
        return success(this.memberCollectSubjectService.page(page, new QueryWrapper<>(memberCollectSubject)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.memberCollectSubjectService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param memberCollectSubject 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody MemberCollectSubjectEntity memberCollectSubject) {
        return success(this.memberCollectSubjectService.save(memberCollectSubject));
    }

    /**
     * 修改数据
     *
     * @param memberCollectSubject 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody MemberCollectSubjectEntity memberCollectSubject) {
        return success(this.memberCollectSubjectService.updateById(memberCollectSubject));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.memberCollectSubjectService.removeByIds(idList));
    }
}

