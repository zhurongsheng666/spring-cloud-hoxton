package com.hystrix.controller;

import com.hystrix.service.FeginService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: @DefaultProperties全局降级方法
 * @Auther: zhurongsheng
 * @Date: 2020/3/14 22:32
 */
@RequestMapping("/customer")
@RestController
public class HystrixController {

    @Autowired
    private FeginService feginService;


    @GetMapping("/hello")
    public String hello(){
        return  feginService.hello();
    }


    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
    })
    @GetMapping("/threeseconds")
    public String threeseconds(){
        return feginService.threeseconds();
    }

}
