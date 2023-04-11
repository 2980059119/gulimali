package com.atguigu.gulimall.ware.entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 仓库信息(WareInfo)表实体类
 *
 * @author makejava
 * @since 2023-04-11 21:23:38
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("wms_ware_info")
public class WareInfoEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * 仓库名
     */
    private String name;
    /**
     * 仓库地址
     */
    private String address;
    /**
     * 区域编码
     */
    private String areacode;


}

