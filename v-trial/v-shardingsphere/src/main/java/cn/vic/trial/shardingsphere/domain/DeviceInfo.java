package cn.vic.trial.shardingsphere.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 设备信息
 * @TableName device_info
 */
@TableName(value ="device_info")
@Data
public class DeviceInfo implements Serializable {
    /**
     * 设备id
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 租户id
     */
    @TableField(value = "tenant_id")
    private Long tenantId;

    /**
     * 设备类型,1-路由器,2-音响,3-摄像头
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 设备品牌
     */
    @TableField(value = "brand")
    private String brand;

    /**
     * 设备型号
     */
    @TableField(value = "model")
    private String model;

    /**
     * 设备名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Long createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Long updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}