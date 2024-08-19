package cn.vic.trial.shardingsphere.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 路由器配置信息
 *
 * @TableName router_config_
 */
@TableName(value = "router_config")
@Data
public class RouterConfig implements Serializable {
    /**
     * 主键
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
     * wifi名称
     */
    private String wifiName;

    /**
     * wifi密码
     */
    private String wifiPassword;

    /**
     * 加密类型,0-不加密,1-WPA-PSK,2-WPA2-PSK,3-WPA/WPA2-PSK
     */
    private Integer encryptType;

    /**
     * 管理员密码
     */
    private String adminPassword;

    /**
     * wifi开关,0-关闭,1-开启
     */
    private Integer wifiSwitch;

    /**
     * 是否隐藏 wifi,0-不隐藏,1-隐藏
     */
    private Integer hideSwitch;

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