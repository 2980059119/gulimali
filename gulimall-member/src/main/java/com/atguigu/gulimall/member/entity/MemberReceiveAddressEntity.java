package com.atguigu.gulimall.member.entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 会员收货地址(MemberReceiveAddress)表实体类
 *
 * @author makejava
 * @since 2023-04-11 20:54:50
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_member_receive_address")
public class MemberReceiveAddressEntity {
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
     * 收货人姓名
     */
    private String name;
    /**
     * 电话
     */
    private String phone;
    /**
     * 邮政编码
     */
    private String postCode;
    /**
     * 省份/直辖市
     */
    private String province;
    /**
     * 城市
     */
    private String city;
    /**
     * 区
     */
    private String region;
    /**
     * 详细地址(街道)
     */
    private String detailAddress;
    /**
     * 省市区代码
     */
    private String areacode;
    /**
     * 是否默认
     */
    private Integer defaultStatus;


}

