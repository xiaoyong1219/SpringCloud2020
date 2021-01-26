package com.xiaoyong.springcloud.config;

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
    public RestTemplate getTemplate(){
        return new RestTemplate();
    }
}
