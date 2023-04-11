package com.atguigu.gulimall.ware.entity;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 库存工作单(WareOrderTaskDetail)表实体类
 *
 * @author makejava
 * @since 2023-04-11 21:23:38
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("wms_ware_order_task_detail")
public class WareOrderTaskDetailEntity {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * sku_id
     */
    private Long skuId;
    /**
     * sku_name
     */
    private String skuName;
    /**
     * 购买个数
     */
    private Integer skuNum;
    /**
     * 工作单id
     */
    private Long taskId;


}

