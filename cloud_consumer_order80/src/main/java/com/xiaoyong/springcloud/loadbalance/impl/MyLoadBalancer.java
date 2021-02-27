package com.xiaoyong.springcloud.loadbalance.impl;

import com.xiaoyong.springcloud.loadbalance.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Create By dongxiaoyong on /2021/2/27
 * description: 手写LoadBalance负载均衡（模拟Ribbon的轮询负载均衡算法）
 *
 * @author dongxiaoyong
 */
@Component
public class MyLoadBalancer implements LoadBalancer {

    private AtomicInteger nextServerCyclicCounter;

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        return null;
    }
}
