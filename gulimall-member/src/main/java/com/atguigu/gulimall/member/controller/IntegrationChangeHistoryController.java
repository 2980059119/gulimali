package com.atguigu.gulimall.member.controller;


import com.atguigu.gulimall.member.entity.IntegrationChangeHistoryEntity;
import com.atguigu.gulimall.member.service.IntegrationChangeHistoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 积分变化历史记录(IntegrationChangeHistory)表控制层
 *
 * @author makejava
 * @since 2023-04-11 20:54:48
 */
@RestController
@RequestMapping("integrationChangeHistory")
public class IntegrationChangeHistoryController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private IntegrationChangeHistoryService integrationChangeHistoryService;

    /**
     * 分页查询所有数据
     *
     * @param page                     分页对象
     * @param integrationChangeHistory 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<IntegrationChangeHistoryEntity> page, IntegrationChangeHistoryEntity integrationChangeHistory) {
        return success(this.integrationChangeHistoryService.page(page, new QueryWrapper<>(integrationChangeHistory)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.integrationChangeHistoryService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param integrationChangeHistory 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody IntegrationChangeHistoryEntity integrationChangeHistory) {
        return success(this.integrationChangeHistoryService.save(integrationChangeHistory));
    }

    /**
     * 修改数据
     *
     * @param integrationChangeHistory 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody IntegrationChangeHistoryEntity integrationChangeHistory) {
        return success(this.integrationChangeHistoryService.updateById(integrationChangeHistory));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.integrationChangeHistoryService.removeByIds(idList));
    }
}

