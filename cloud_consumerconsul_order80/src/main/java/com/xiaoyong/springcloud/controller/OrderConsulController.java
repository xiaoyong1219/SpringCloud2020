package com.xiaoyong.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Create By dongxiaoyong on /2021/1/30
 * description: 控制器
 *
 * @author dongxiaoyong
 */
@RestController
@RequestMapping("/consumer/consul")
public class OrderConsulController {

    public static final String INVOKE_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping
    @RequestMapping(value = "/payment")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul/paymentConsul",String.class);
        return result;
    }
}
