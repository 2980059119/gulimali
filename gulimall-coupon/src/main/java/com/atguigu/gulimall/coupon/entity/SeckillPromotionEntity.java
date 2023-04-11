package com.atguigu.gulimall.coupon.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 秒杀活动(SeckillPromotion)表实体类
 *
 * @author makejava
 * @since 2023-04-08 21:45:40
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_seckill_promotion")
public class SeckillPromotionEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * 活动标题
     */
    private String title;
    /**
     * 开始日期
     */
    private Date startTime;
    /**
     * 结束日期
     */
    private Date endTime;
    /**
     * 上下线状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private Long userId;


}

