package com.xiaoyong.springcloud;

import com.xiaoyong.myrule.MySelfRibbonLoadBalanceRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Create By dongxiaoyong on /2020/12/30
 * description: 启动类
 *
 * @author dongxiaoyong
 * @EnableEurekaClient 将服务注册到Eureka服务中心
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
//指定Ribbon配置类，访问CLOUD-PAYMENT-SERVICE服务时，使用自定义的Ribbon负载规则类
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRibbonLoadBalanceRule.class)
public class CloudConsumerOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrderApplication.class, args);
    }
}
