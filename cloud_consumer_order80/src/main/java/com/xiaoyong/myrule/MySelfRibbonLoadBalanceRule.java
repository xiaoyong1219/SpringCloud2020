package com.xiaoyong.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create By dongxiaoyong on /2021/2/1
 * description: 自定义Ribbon配置类
 * (不能和SpringBoot启动类放在同一个包路径下，否则自定义的Ribbon负载规则类不生效)
 *
 * @author dongxiaoyong
 */
@Configuration
public class MySelfRibbonLoadBalanceRule {
    @Bean
    public IRule myRule(){
        return new RoundRobinRule();//Ribbon默认负载规则：轮询
//        return new RetryRule();//先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试
//        return new RandomRule();//定义Ribbon负载规则为随机，默认是轮询

    }
}
