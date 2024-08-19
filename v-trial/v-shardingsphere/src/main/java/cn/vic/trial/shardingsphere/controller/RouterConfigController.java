package cn.vic.trial.shardingsphere.controller;

import cn.vic.trial.shardingsphere.domain.DeviceInfo;
import cn.vic.trial.shardingsphere.domain.RouterConfig;
import cn.vic.trial.shardingsphere.service.RouterConfigService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sheng.liu@marketin.cn
 * @date 2024/8/14
 */
@RestController
@RequestMapping("/router/config")
public class RouterConfigController {

    @Resource
    private RouterConfigService routerConfigService;

    @GetMapping("/{tenant_id}")
    public List<RouterConfig> queryByTenantId(@PathVariable(value = "tenant_id") Long tenantId) {
        return routerConfigService.lambdaQuery()
                .eq(RouterConfig::getTenantId, tenantId)
                .list();
    }

    @GetMapping("/query")
    public List<RouterConfig> query() {
        return routerConfigService.list();
    }

    @PostMapping("/add")
    public void add(@RequestBody RouterConfig routerConfig) {
        routerConfigService.save(routerConfig);
    }

    @PostMapping("/update")
    public void update(@RequestBody RouterConfig routerConfig) {
        routerConfigService.lambdaUpdate()
                .eq(RouterConfig::getTenantId, routerConfig.getTenantId())
                .eq(RouterConfig::getDeviceId, routerConfig.getDeviceId())
                .eq(RouterConfig::getId, routerConfig.getId())
                .update(routerConfig);
    }

}
