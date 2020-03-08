package com.payment.controller;

import com.payment.consts.ResponseResultConsts;
import com.payment.po.PaymentPo;
import com.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/8 01:53
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    /**
     * 根据ID查
     */
    @GetMapping("/{id}")
    public ResponseResultConsts selectPayment(@PathVariable("id") String id){
        PaymentPo paymentPo = paymentService.selectById(id);
        if (paymentPo==null){
            return ResponseResultConsts.fail(500,"查询失败");
        }
        return ResponseResultConsts.success(paymentPo,"查询成功");
    }

    /**
     * 根据流水号添加
     */
    @PostMapping("/payment")
    public ResponseResultConsts insertPayment(@RequestBody PaymentPo payment){
        PaymentPo paymentPo = paymentService.insert(payment);
        if (paymentPo==null){
            return ResponseResultConsts.fail(500,"插入失败");
        }
        return ResponseResultConsts.success(paymentPo,"添加成功");
    }
}
