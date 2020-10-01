package cn.tellsea.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Tellsea
 * @date 2020/09/26
 */
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class Payment8002 {

    public static void main(String[] args) {
        SpringApplication.run(Payment8002.class, args);
    }
}
