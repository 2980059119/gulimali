package com.atguigu.gulimall.member.entity;

import java.util.Date;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 会员收藏的商品(MemberCollectSpu)表实体类
 *
 * @author makejava
 * @since 2023-04-11 20:54:48
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_member_collect_spu")
public class MemberCollectSpuEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * 会员id
     */
    private Long memberId;
    /**
     * spu_id
     */
    private Long spuId;
    /**
     * spu_name
     */
    private String spuName;
    /**
     * spu_img
     */
    private String spuImg;
    /**
     * create_time
     */
    private Date createTime;


}

