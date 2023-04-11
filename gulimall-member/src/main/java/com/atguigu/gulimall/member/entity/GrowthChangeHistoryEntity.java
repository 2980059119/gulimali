package com.atguigu.gulimall.member.entity;

import java.util.Date;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 成长值变化历史记录(GrowthChangeHistory)表实体类
 *
 * @author makejava
 * @since 2023-04-11 20:54:47
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_growth_change_history")
public class GrowthChangeHistoryEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * member_id
     */
    private Long memberId;
    /**
     * create_time
     */
    private Date createTime;
    /**
     * 改变的值（正负计数）
     */
    private Integer changeCount;
    /**
     * 备注
     */
    private String note;
    /**
     * 积分来源[0-购物，1-管理员修改]
     */
    private Integer sourceType;


}

