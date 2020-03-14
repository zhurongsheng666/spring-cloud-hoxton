package com.hystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/14 22:28
 */
@FeignClient(value = "PROVIDER-HYSTRIX",fallback = FeginFallbackService.class,path = "/hystrix")
@Service
public interface FeginService {

    @GetMapping("/hello")
    String hello();


    @GetMapping("/threeseconds")
    String threeseconds();

}
