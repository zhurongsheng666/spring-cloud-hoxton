package com.order.controller;

import consts.ResponseResultConsts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import po.PaymentPo;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/8 16:15
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String BASE_PAYMENT_URL="http://localhost:9000/payment/";


    @GetMapping("/{id}")
    public ResponseResultConsts selectPayment(@PathVariable("id") String id){
        ResponseEntity<ResponseResultConsts> forEntity =
                restTemplate.getForEntity(BASE_PAYMENT_URL+id, ResponseResultConsts.class, id);
        return  forEntity.getBody();
    }

    @PostMapping("/payment")
    public ResponseResultConsts insertPayment(@RequestBody PaymentPo payment){
        ResponseEntity<ResponseResultConsts> response = restTemplate.postForEntity(BASE_PAYMENT_URL + "payment", payment, ResponseResultConsts.class);
        return response.getBody();
    }
}
