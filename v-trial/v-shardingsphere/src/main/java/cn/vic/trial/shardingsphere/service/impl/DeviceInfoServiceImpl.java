package cn.vic.trial.shardingsphere.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.vic.trial.shardingsphere.domain.DeviceInfo;
import cn.vic.trial.shardingsphere.service.DeviceInfoService;
import cn.vic.trial.shardingsphere.mapper.DeviceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author vic
* @description 针对表【device_info(设备信息)】的数据库操作Service实现
* @createDate 2024-08-15 17:52:49
*/
@Service
public class DeviceInfoServiceImpl extends ServiceImpl<DeviceInfoMapper, DeviceInfo>
    implements DeviceInfoService{

}




