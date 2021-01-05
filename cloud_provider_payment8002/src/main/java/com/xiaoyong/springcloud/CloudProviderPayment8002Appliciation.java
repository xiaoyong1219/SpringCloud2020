package com.xiaoyong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Create By dongxiaoyong on /2020/12/30
 * description: 启动类
 * @EnableEurekaClient 将服务注册到Eureka服务中心
 * @author dongxiaoyong
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudProviderPayment8002Appliciation {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8002Appliciation.class,args);
    }
}
