package com.atguigu.gulimall.member.entity;

import java.util.Date;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 会员登录记录(MemberLoginLog)表实体类
 *
 * @author makejava
 * @since 2023-04-11 20:54:49
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_member_login_log")
public class MemberLoginLogEntity {
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
     * 创建时间
     */
    private Date createTime;
    /**
     * ip
     */
    private String ip;
    /**
     * city
     */
    private String city;
    /**
     * 登录类型[1-web，2-app]
     */
    private Integer loginType;


}

