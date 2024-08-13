package cn.vic.trial.shardingsphere.service.impl;

import cn.vic.trial.shardingsphere.domain.DeviceInfo;
import cn.vic.trial.shardingsphere.mapper.DeviceInfoMapper;
import cn.vic.trial.shardingsphere.service.DeviceInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author vic
* @description 针对表【device_info(设备信息)】的数据库操作Service实现
* @createDate 2024-08-13 17:39:59
*/
@Service
public class DeviceInfoServiceImpl extends ServiceImpl<DeviceInfoMapper, DeviceInfo>
    implements DeviceInfoService {

}




