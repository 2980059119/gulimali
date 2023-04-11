package com.atguigu.gulimall.coupon.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(HomeSubject)表实体类
 *
 * @author makejava
 * @since 2023-04-08 21:45:39
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sms_home_subject")
public class HomeSubjectEntity {
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
     * 专题标题
     */
    private String title;
    /**
     * 专题副标题
     */
    private String subTitle;
    /**
     * 显示状态
     */
    private Integer status;
    /**
     * 详情连接
     */
    private String url;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 专题图片地址
     */
    private String img;


}

