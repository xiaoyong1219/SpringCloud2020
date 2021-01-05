package com.xiaoyong.springcloud.controller;

import com.xiaoyong.springcloud.entities.CommonResult;
import com.xiaoyong.springcloud.entities.Payment;
import com.xiaoyong.springcloud.services.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create By dongxiaoyong on /2020/12/30
 * description: 支付controller
 *
 * @author dongxiaoyong
 */
@Slf4j
@RestController
@RequestMapping(value = "/payment")
@Api(tags = "支付模块")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/create")
    @ApiOperation(notes = "插入支付记录", value = "插入订单记录")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        if (result > 0) {
            log.info("插入记录成功：{},serverPort：{}", payment, serverPort);
            return new CommonResult(200, "插入数据库成功，serverPort：" + serverPort, payment.getId());
        } else {
            log.info("插入记录失败：{}", payment);
            return new CommonResult<>(0, "插入数据库失败，serverPort：" + serverPort);
        }
    }

    @GetMapping(value = "/get/{id}")
    @ApiOperation(notes = "根据id查询支付记录", value = "根据id查询支付记录")
    public CommonResult<Payment> get(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            log.info("查询记录：{}", payment);
            return new CommonResult(200, "查询成功，serverPort：" + serverPort, payment);
        } else {
            return new CommonResult<>(0, "无数据，查询ID：，serverPort：" + serverPort + " ,id: " + id);
        }
    }

    @GetMapping(value = "/discovery/{serviceId}")
    @ApiOperation(notes = "根据eureka服务名称查询服务实例信息", value = "根据eureka服务名称查询服务实例信息")
    public CommonResult discovery(@PathVariable("serviceId") String serviceId) {
        Map<String, Object> map = new HashMap<>();
        List<String> services = discoveryClient.getServices();
        map.put("services", services);
       List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances(serviceId);
       map.put("serviceInstanceList",serviceInstanceList);
       return new CommonResult(200,"查询: "+ serviceId + " 服务信息成功",map);
    }
}
