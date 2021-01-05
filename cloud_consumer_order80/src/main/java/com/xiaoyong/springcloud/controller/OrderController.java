package com.xiaoyong.springcloud.controller;

import com.xiaoyong.springcloud.entities.CommonResult;
import com.xiaoyong.springcloud.entities.Payment;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Create By dongxiaoyong on /2020/12/30
 * description: 订单controller
 *
 * @author dongxiaoyong
 */
@RestController
@RequestMapping(value = "/consumer/order")
@Slf4j
@Api(tags = "订单模块")
public class OrderController {

    //单机版，直接请求服务
    //private static final String PAYMENT_URL = "http://localhost:8001";

    //eureka注册服务版，这里指定的是payment服务在eureka服务中暴露的服务名，
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;

    @PostMapping(value = "/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create",payment,CommonResult.class);
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/"+id,CommonResult.class);
    }

}
