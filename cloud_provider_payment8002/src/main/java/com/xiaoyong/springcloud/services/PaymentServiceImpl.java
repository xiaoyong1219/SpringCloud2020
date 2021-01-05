package com.xiaoyong.springcloud.services;

import com.xiaoyong.springcloud.dao.PaymentDao;
import com.xiaoyong.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Create By dongxiaoyong on /2020/12/30
 * description: 订单service实现类
 *
 * @author dongxiaoyong
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
