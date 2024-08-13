package cn.vic.trial.shardingsphere.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sheng.liu@marketin.cn
 * @date 2024/8/13
 */
@MapperScan("cn.vic.trial.shardingsphere.mapper")
@ComponentScan({"cn.vic.trial.shardingsphere"})
@Configuration
public class ApplicationConfig {

}
