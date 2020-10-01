package cn.tellsea.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate 配置
 *
 * @author Tellsea
 * @date 2020/09/26
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    // @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
