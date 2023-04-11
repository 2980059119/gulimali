package com.atguigu.gulimall.member.controller;


import com.atguigu.gulimall.member.entity.MemberCollectSpuEntity;
import com.atguigu.gulimall.member.service.MemberCollectSpuService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 会员收藏的商品(MemberCollectSpu)表控制层
 *
 * @author makejava
 * @since 2023-04-11 20:54:48
 */
@RestController
@RequestMapping("memberCollectSpu")
public class MemberCollectSpuController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private MemberCollectSpuService memberCollectSpuService;

    /**
     * 分页查询所有数据
     *
     * @param page             分页对象
     * @param memberCollectSpu 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<MemberCollectSpuEntity> page, MemberCollectSpuEntity memberCollectSpu) {
        return success(this.memberCollectSpuService.page(page, new QueryWrapper<>(memberCollectSpu)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.memberCollectSpuService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param memberCollectSpu 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody MemberCollectSpuEntity memberCollectSpu) {
        return success(this.memberCollectSpuService.save(memberCollectSpu));
    }

    /**
     * 修改数据
     *
     * @param memberCollectSpu 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody MemberCollectSpuEntity memberCollectSpu) {
        return success(this.memberCollectSpuService.updateById(memberCollectSpu));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.memberCollectSpuService.removeByIds(idList));
    }
}

