package com.xiaoyong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Create By dongxiaoyong on /2020/12/30
 * description: 启动类
 * @EnableEurekaClient 将服务注册到Eureka服务中心
 * @author dongxiaoyong
 */

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient
public class CloudConsumerOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrderApplication.class, args);
    }
}
