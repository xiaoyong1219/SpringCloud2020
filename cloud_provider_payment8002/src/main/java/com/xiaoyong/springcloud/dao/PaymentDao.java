package com.xiaoyong.springcloud.dao;

import com.xiaoyong.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Create By dongxiaoyong on /2020/12/30
 * description: 订单dao
 *
 * @author dongxiaoyong
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}