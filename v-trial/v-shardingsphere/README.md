# shardingsphere trial

## 概要
数据库: 2个+

数据库表: 3个+

这里以最简分库分表为例: 一个单表(设备信息表)，三张分表(路由器配置表)

## schema
- device0
- device1

## 表结构
```sql
DROP TABLE IF EXISTS device_info;

DROP TABLE IF EXISTS router_config_0;

DROP TABLE IF EXISTS router_config_1;

DROP TABLE IF EXISTS router_config_2;

/*==============================================================*/
/* Table: DEVICE_INFO                                           */
/*==============================================================*/
CREATE TABLE device_info
(
    id                   BIGINT auto_increment NOT NULL COMMENT 'id',
    tenant_id            BIGINT NOT NULL COMMENT '租户id',
    device_id            BIGINT COMMENT '设备id',
    type                 TINYINT COMMENT '设备类型,1-路由器,2-音响,3-摄像头',
    brand                VARCHAR(32) COMMENT '设备品牌',
    model                VARCHAR(32) COMMENT '设备型号',
    name                 VARCHAR(32) COMMENT '设备名称',
    create_time          BIGINT DEFAULT (UNIX_TIMESTAMP()) COMMENT '创建时间',
    update_time          BIGINT DEFAULT (UNIX_TIMESTAMP()) COMMENT '更新时间',
    PRIMARY KEY (id)
)
    ENGINE = INNODB ;

ALTER TABLE device_info COMMENT '设备信息';

/*==============================================================*/
/* Table: ROUTER_CONFIG_0                                       */
/*==============================================================*/
CREATE TABLE router_config_0
(
    id                   BIGINT auto_increment NOT NULL COMMENT '主键',
    tenant_id            BIGINT NOT NULL COMMENT '租户id',
    device_id            BIGINT COMMENT '设备id',
    wifi_name            VARCHAR(32) COMMENT 'wifi名称',
    wifi_password        VARCHAR(64) COMMENT 'wifi密码',
    encrypt_type         TINYINT DEFAULT 0 COMMENT '加密类型,0-不加密,1-WPA-PSK,2-WPA2-PSK,3-WPA/WPA2-PSK',
    admin_password       VARCHAR(64) COMMENT '管理员密码',
    wifi_switch          TINYINT DEFAULT 1 COMMENT 'wifi开关,0-关闭,1-开启',
    hide_switch          TINYINT DEFAULT 0 COMMENT '是否隐藏 wifi,0-不隐藏,1-隐藏',
    create_time          BIGINT DEFAULT (UNIX_TIMESTAMP()) COMMENT '创建时间',
    update_time          BIGINT DEFAULT (UNIX_TIMESTAMP()) COMMENT '更新时间',
    PRIMARY KEY (id)
)
    ENGINE = INNODB ;

ALTER TABLE router_config_0 COMMENT '路由器配置信息';

/*==============================================================*/
/* Table: ROUTER_CONFIG_1                                       */
/*==============================================================*/
CREATE TABLE router_config_1
(
    id                   BIGINT auto_increment NOT NULL COMMENT '主键',
    tenant_id            BIGINT NOT NULL COMMENT '租户id',
    device_id            BIGINT COMMENT '设备id',
    wifi_name            VARCHAR(32) COMMENT 'wifi名称',
    wifi_password        VARCHAR(64) COMMENT 'wifi密码',
    encrypt_type         TINYINT DEFAULT 0 COMMENT '加密类型,0-不加密,1-WPA-PSK,2-WPA2-PSK,3-WPA/WPA2-PSK',
    admin_password       VARCHAR(64) COMMENT '管理员密码',
    wifi_switch          TINYINT DEFAULT 1 COMMENT 'wifi开关,0-关闭,1-开启',
    hide_switch          TINYINT DEFAULT 0 COMMENT '是否隐藏 wifi,0-不隐藏,1-隐藏',
    create_time          BIGINT DEFAULT (UNIX_TIMESTAMP()) COMMENT '创建时间',
    update_time          BIGINT DEFAULT (UNIX_TIMESTAMP()) COMMENT '更新时间',
    PRIMARY KEY (id)
)
    ENGINE = INNODB ;

ALTER TABLE router_config_1 COMMENT '路由器配置信息';

/*==============================================================*/
/* Table: ROUTER_CONFIG_2                                       */
/*==============================================================*/
CREATE TABLE router_config_2
(
    id                   BIGINT auto_increment NOT NULL COMMENT '主键',
    tenant_id            BIGINT NOT NULL COMMENT '租户id',
    device_id            BIGINT COMMENT '设备id',
    wifi_name            VARCHAR(32) COMMENT 'wifi名称',
    wifi_password        VARCHAR(64) COMMENT 'wifi密码',
    encrypt_type         TINYINT DEFAULT 0 COMMENT '加密类型,0-不加密,1-WPA-PSK,2-WPA2-PSK,3-WPA/WPA2-PSK',
    admin_password       VARCHAR(64) COMMENT '管理员密码',
    wifi_switch          TINYINT DEFAULT 1 COMMENT 'wifi开关,0-关闭,1-开启',
    hide_switch          TINYINT DEFAULT 0 COMMENT '是否隐藏 wifi,0-不隐藏,1-隐藏',
    create_time          BIGINT DEFAULT (UNIX_TIMESTAMP()) COMMENT '创建时间',
    update_time          BIGINT DEFAULT (UNIX_TIMESTAMP()) COMMENT '更新时间',
    PRIMARY KEY (id)
)
    ENGINE = INNODB ;

ALTER TABLE router_config_2 COMMENT '路由器配置信息';
```

## 