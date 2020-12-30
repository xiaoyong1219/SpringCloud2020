package com.xiaoyong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Create By dongxiaoyong on /2020/12/30
 * description: 启动类
 *
 * @author dongxiaoyong
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class CloudConsumerOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrderApplication.class, args);
    }
}
