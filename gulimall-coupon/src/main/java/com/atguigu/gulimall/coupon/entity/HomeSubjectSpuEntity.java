package com.atguigu.gulimall.coupon.entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 专题商品(HomeSubjectSpu)表实体类
 *
 * @author makejava
 * @since 2023-04-08 21:45:39
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_home_subject_spu")
public class HomeSubjectSpuEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * 专题名字
     */
    private String name;
    /**
     * 专题id
     */
    private Long subjectId;
    /**
     * spu_id
     */
    private Long spuId;
    /**
     * 排序
     */
    private Integer sort;


}

