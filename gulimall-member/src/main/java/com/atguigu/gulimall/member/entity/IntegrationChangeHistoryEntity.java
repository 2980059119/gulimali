package com.atguigu.gulimall.member.entity;

import java.util.Date;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 积分变化历史记录(IntegrationChangeHistory)表实体类
 *
 * @author makejava
 * @since 2023-04-11 20:54:48
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_integration_change_history")
public class IntegrationChangeHistoryEntity {
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
     * 变化的值
     */
    private Integer changeCount;
    /**
     * 备注
     */
    private String note;
    /**
     * 来源[0->购物；1->管理员修改;2->活动]
     */
    private Integer sourceTyoe;


}

