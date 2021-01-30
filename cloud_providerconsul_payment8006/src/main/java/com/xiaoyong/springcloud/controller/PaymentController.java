package com.xiaoyong.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Create By dongxiaoyong on /2021/1/30
 * description: 控制器
 *
 * @author dongxiaoyong
 */
@RestController
@Slf4j
@RequestMapping(value = "/payment/consul")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping
    @RequestMapping(value = "/paymentConsul")
    public String paymentConsul(){
        return "springCloud with consul: " + serverPort + "\t" + UUID.randomUUID();
    }
}
