package com.payment.service;

import com.payment.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import po.PaymentPo;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/8 02:11
 */
@Service
public class PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    public PaymentPo selectById(String id){
        return paymentMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public PaymentPo insert(PaymentPo payment){
        paymentMapper.insertSelective(payment);
        return payment;
    }

}
