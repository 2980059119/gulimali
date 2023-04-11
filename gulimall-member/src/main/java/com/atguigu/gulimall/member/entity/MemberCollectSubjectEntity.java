package com.atguigu.gulimall.member.entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 会员收藏的专题活动(MemberCollectSubject)表实体类
 *
 * @author makejava
 * @since 2023-04-11 20:54:49
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_member_collect_subject")
public class MemberCollectSubjectEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * subject_id
     */
    private Long subjectId;
    /**
     * subject_name
     */
    private String subjectName;
    /**
     * subject_img
     */
    private String subjectImg;
    /**
     * 活动url
     */
    private String subjectUrll;


}

