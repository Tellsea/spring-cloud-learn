package cn.tellsea.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tellsea
 * @date 2020/10/01
 */
@Configuration
@MapperScan({"cn.tellsea.springcloud.dao"})
public class MyBatisConfig {

}
