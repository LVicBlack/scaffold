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
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 租户id
     */
    private Long tenantId;

    /**
     * 设备id
     */
    private Long deviceId;

    /**
     * 设备类型,1-路由器,2-音响,3-摄像头
     */
    private Integer type;

    /**
     * 设备品牌
     */
    private String brand;

    /**
     * 设备型号
     */
    private String model;

    /**
     * 设备名称
     */
    private String name;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}