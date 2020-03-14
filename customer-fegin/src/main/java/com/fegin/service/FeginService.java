package com.fegin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/14 17:23
 */
@Service
@FeignClient("PROVIDER-PAYMENT-SERVICE")
@RequestMapping("/ribbon")
public interface FeginService {


    @GetMapping("/threeseconds")
    String threeseconds();

    @GetMapping("/server")
    String server();
}
