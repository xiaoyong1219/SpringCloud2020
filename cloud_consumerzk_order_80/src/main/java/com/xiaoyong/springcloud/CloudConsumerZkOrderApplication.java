package com.xiaoyong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Create By dongxiaoyong on /2021/1/26
 * description: 启动类
 *
 * @author dongxiaoyong
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerZkOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerZkOrderApplication.class,args);
    }
}
