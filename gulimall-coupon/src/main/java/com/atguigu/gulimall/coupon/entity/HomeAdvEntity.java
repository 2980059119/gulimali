package com.atguigu.gulimall.coupon.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 首页轮播广告(HomeAdv)表实体类
 *
 * @author makejava
 * @since 2023-04-08 21:45:39
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_home_adv")
public class HomeAdvEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * 名字
     */
    private String name;
    /**
     * 图片地址
     */
    private String pic;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 结束时间
     */
    private Date endTime;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 点击数
     */
    private Integer clickCount;
    /**
     * 广告详情连接地址
     */
    private String url;
    /**
     * 备注
     */
    private String note;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 发布者
     */
    private Long publisherId;
    /**
     * 审核者
     */
    private Long authId;


}

