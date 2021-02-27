package com.xiaoyong.springcloud.loadbalance;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * Create By dongxiaoyong on /2021/2/27
 * description: 手写LoadBalance负载均衡（模拟Ribbon的轮询负载均衡算法）
 *
 * @author dongxiaoyong
 */
public interface LoadBalancer {

    /**
     * 收集服务器总共有多少台能够提供服务的机器，并放到list里面
     *
     * @param serviceInstances
     * @Author :dongxiaoyong
     * @Date : 2021/2/27 16:35
     * @return: org.springframework.cloud.client.ServiceInstance
     */

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}