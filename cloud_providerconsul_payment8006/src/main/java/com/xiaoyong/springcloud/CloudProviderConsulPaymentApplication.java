package com.xiaoyong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Create By dongxiaoyong on /2021/1/29
 * description: 启动类
 *
 * @author dongxiaoyong
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class CloudProviderConsulPaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderConsulPaymentApplication.class,args);
    }
}
