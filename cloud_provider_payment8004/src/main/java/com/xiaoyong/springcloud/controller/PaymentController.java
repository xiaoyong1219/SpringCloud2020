package com.xiaoyong.springcloud.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Create By dongxiaoyong on /2021/1/25
 * description: 支付controller
 *
 * @author dongxiaoyong
 */
@Slf4j
@RestController
@RequestMapping(value = "/payment")
@Api(tags = "支付模块")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/zk")
    public String paymentZk() {
        return "SpringCloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }

    @GetMapping(value = "/zkt")
    public String paymentZkt() {
        log.error("出错了");
        return "SpringCloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
