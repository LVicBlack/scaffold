package cn.vic.trial.shardingsphere.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
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
    @TableId
    private Long id;

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
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}