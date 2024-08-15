package cn.vic.trial.shardingsphere.controller;

import cn.vic.trial.shardingsphere.domain.DeviceInfo;
import cn.vic.trial.shardingsphere.service.DeviceInfoService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sheng.liu@marketin.cn
 * @date 2024/8/14
 */
@RestController
@RequestMapping("/device/info")
public class DeviceInfoController {

    @Resource
    private DeviceInfoService deviceInfoService;

    @GetMapping("/{tenant_id}")
    public List<DeviceInfo> queryByTenantId(@PathVariable(value = "tenant_id") Long tenantId) {
        return deviceInfoService.lambdaQuery()
                .eq(DeviceInfo::getTenantId, tenantId)
                .list();
    }

    @GetMapping("/query")
    public List<DeviceInfo> query() {
        return deviceInfoService.list();
    }

}
