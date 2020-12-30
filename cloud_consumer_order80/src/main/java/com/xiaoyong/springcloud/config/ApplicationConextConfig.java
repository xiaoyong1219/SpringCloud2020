package com.xiaoyong.springcloud.config;

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
    public RestTemplate getRestTempliate(){
        return new RestTemplate();
    }
}
