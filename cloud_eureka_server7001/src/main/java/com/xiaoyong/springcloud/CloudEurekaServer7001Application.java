package com.xiaoyong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Create By dongxiaoyong on /2021/1/5
 * description: 启动类入口
 * @EnableEurekaServer 表明自身是Eureka注册服务端
 * @author dongxiaoyong
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7001Application.class, args);
    }
}
