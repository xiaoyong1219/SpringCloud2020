package com.xiaoyong.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Create By dongxiaoyong on /2020/12/30
 * description: 配置类
 *
 * @author dongxiaoyong
 */
@Configuration
public class ApplicationConextConfig {

    @Bean
    @LoadBalanced //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTempliate(){
        return new RestTemplate();
    }
}
