package cn.vic.trial.shardingsphere.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 路由器配置信息
 * @TableName router_config_2
 */
@TableName(value ="router_config_2")
@Data
public class RouterConfig2 implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Long id;

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
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RouterConfig2 other = (RouterConfig2) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDeviceId() == null ? other.getDeviceId() == null : this.getDeviceId().equals(other.getDeviceId()))
            && (this.getWifiName() == null ? other.getWifiName() == null : this.getWifiName().equals(other.getWifiName()))
            && (this.getWifiPassword() == null ? other.getWifiPassword() == null : this.getWifiPassword().equals(other.getWifiPassword()))
            && (this.getEncryptType() == null ? other.getEncryptType() == null : this.getEncryptType().equals(other.getEncryptType()))
            && (this.getAdminPassword() == null ? other.getAdminPassword() == null : this.getAdminPassword().equals(other.getAdminPassword()))
            && (this.getWifiSwitch() == null ? other.getWifiSwitch() == null : this.getWifiSwitch().equals(other.getWifiSwitch()))
            && (this.getHideSwitch() == null ? other.getHideSwitch() == null : this.getHideSwitch().equals(other.getHideSwitch()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        result = prime * result + ((getWifiName() == null) ? 0 : getWifiName().hashCode());
        result = prime * result + ((getWifiPassword() == null) ? 0 : getWifiPassword().hashCode());
        result = prime * result + ((getEncryptType() == null) ? 0 : getEncryptType().hashCode());
        result = prime * result + ((getAdminPassword() == null) ? 0 : getAdminPassword().hashCode());
        result = prime * result + ((getWifiSwitch() == null) ? 0 : getWifiSwitch().hashCode());
        result = prime * result + ((getHideSwitch() == null) ? 0 : getHideSwitch().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", wifiName=").append(wifiName);
        sb.append(", wifiPassword=").append(wifiPassword);
        sb.append(", encryptType=").append(encryptType);
        sb.append(", adminPassword=").append(adminPassword);
        sb.append(", wifiSwitch=").append(wifiSwitch);
        sb.append(", hideSwitch=").append(hideSwitch);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}