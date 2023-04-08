package com.atguigu.gulimall.coupon.entity;

import java.util.Date;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 秒杀商品通知订阅(SeckillSkuNotice)表实体类
 *
 * @author makejava
 * @since 2023-04-08 21:45:40
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_seckill_sku_notice")
public class SeckillSkuNoticeEntity {
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
     * sku_id
     */
    private Long skuId;
    /**
     * 活动场次id
     */
    private Long sessionId;
    /**
     * 订阅时间
     */
    private Date subcribeTime;
    /**
     * 发送时间
     */
    private Date sendTime;
    /**
     * 通知方式[0-短信，1-邮件]
     */
    private Integer noticeType;


}

