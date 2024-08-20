package cn.vic.trial.shardingsphere.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.vic.trial.shardingsphere.domain.RouterConfig;
import cn.vic.trial.shardingsphere.service.RouterConfigService;
import cn.vic.trial.shardingsphere.mapper.RouterConfigMapper;
import org.springframework.stereotype.Service;

/**
* @author vic
* @description 针对表【router_config(路由器配置信息)】的数据库操作Service实现
* @createDate 2024-08-20 15:37:10
*/
@Service
public class RouterConfigServiceImpl extends ServiceImpl<RouterConfigMapper, RouterConfig>
    implements RouterConfigService{

}




