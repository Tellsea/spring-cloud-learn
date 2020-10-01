package cn.tellsea.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * spring cloud config：curl -X POST "http://localhost:3355/actuator/refresh"
 * spring cloud bus：curl -X POST "http://localhost:3344/actuator/bus-refresh"
 * spring cloud bus 指定刷新：curl -X POST "http://localhost:3344/actuator/bus-refresh/config-client:3355"
 *
 * @author Tellsea
 * @date 2020/09/29
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}


