package cn.vic.trial.shardingsphere.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 路由器配置信息
 * @TableName router_config
 */
@TableName(value ="router_config")
@Data
public class RouterConfig implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 租户id
     */
    @TableField(value = "tenant_id")
    private Long tenantId;

    /**
     * 设备id
     */
    @TableField(value = "device_id")
    private Long deviceId;

    /**
     * wifi名称
     */
    @TableField(value = "wifi_name")
    private String wifiName;

    /**
     * wifi密码
     */
    @TableField(value = "wifi_password")
    private String wifiPassword;

    /**
     * 加密类型,0-不加密,1-WPA-PSK,2-WPA2-PSK,3-WPA/WPA2-PSK
     */
    @TableField(value = "encrypt_type")
    private Integer encryptType;

    /**
     * 管理员密码
     */
    @TableField(value = "admin_password")
    private String adminPassword;

    /**
     * wifi开关,0-关闭,1-开启
     */
    @TableField(value = "wifi_switch")
    private Integer wifiSwitch;

    /**
     * 是否隐藏 wifi,0-不隐藏,1-隐藏
     */
    @TableField(value = "hide_switch")
    private Integer hideSwitch;

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