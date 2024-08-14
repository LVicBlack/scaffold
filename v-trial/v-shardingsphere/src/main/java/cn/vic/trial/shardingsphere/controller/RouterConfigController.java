package cn.vic.trial.shardingsphere.controller;

import cn.vic.trial.shardingsphere.domain.RouterConfig;
import cn.vic.trial.shardingsphere.service.RouterConfigService;
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
@RequestMapping("/router/config")
public class RouterConfigController {

    @Resource
    private RouterConfigService routerConfigService;

    @GetMapping("/{id}")
    public RouterConfig getById(@PathVariable(value = "id") Long id) {
        return routerConfigService.getById(id);
    }

    @GetMapping("/query")
    public List<RouterConfig> query() {
        return routerConfigService.list();
    }

}
