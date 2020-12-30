package com.xiaoyong.springcloud.services;

import com.xiaoyong.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Create By dongxiaoyong on /2020/12/30
 * description: 订单service
 *
 * @author dongxiaoyong
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}