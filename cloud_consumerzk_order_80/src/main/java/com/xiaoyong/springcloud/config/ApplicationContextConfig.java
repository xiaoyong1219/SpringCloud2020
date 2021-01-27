package com.xiaoyong.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Create By dongxiaoyong on /2021/1/26
 * description: 配置类
 *
 * @author dongxiaoyong
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //若不加此注解，使用Ribbon做客户端负载均衡，服务提供者使用服务名，客户端报错， java.net.UnknownHostException
    public RestTemplate getTemplate(){
        return new RestTemplate();
    }
}
