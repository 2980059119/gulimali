package com.atguigu.gulimall.member.entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 会员等级(MemberLevel)表实体类
 *
 * @author makejava
 * @since 2023-04-11 20:54:49
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("ums_member_level")
public class MemberLevelEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * 等级名称
     */
    private String name;
    /**
     * 等级需要的成长值
     */
    private Integer growthPoint;
    /**
     * 是否为默认等级[0->不是；1->是]
     */
    private Integer defaultStatus;
    /**
     * 免运费标准
     */
    private Double freeFreightPoint;
    /**
     * 每次评价获取的成长值
     */
    private Integer commentGrowthPoint;
    /**
     * 是否有免邮特权
     */
    private Integer priviledgeFreeFreight;
    /**
     * 是否有会员价格特权
     */
    private Integer priviledgeMemberPrice;
    /**
     * 是否有生日特权
     */
    private Integer priviledgeBirthday;
    /**
     * 备注
     */
    private String note;


}

