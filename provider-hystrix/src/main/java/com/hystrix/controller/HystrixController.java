package com.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/14 21:31
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Thread：" + Thread.currentThread().getName();
    }


    /**
     * fallbackMethod 降级方法
     * timeoutInMilliseconds: 2秒为正常响应，超过两秒调用降级方法
     */
    @HystrixCommand(fallbackMethod = "fallbackMethod", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
    })
    @GetMapping("/threeseconds")
    public String threeseconds() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello threeseconds";
    }

    public String fallbackMethod() {
        return "服务器正忙,请稍后访问。Thread：" + Thread.currentThread().getName();
    }


    /**
     * =====================熔断配置=======================
     * circuitBreaker.enabled: 启动熔断
     * circuitBreaker.requestVolumeThreshold：请求次数
     * circuitBreaker.errorThresholdPercentage： 失败率达到多少启动熔断
     */
    @HystrixCommand(fallbackMethod = "circuitBreakerFallback",commandProperties = {
            @HystrixProperty(name="circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "50")
    })
    @GetMapping("/{id}")
    public String circuitBreaker(@PathVariable("id") Integer id) {
        if (id<0){
            throw  new RuntimeException("id ="+id+"，不能为负数");
        }
        return "调用成功，O(∩_∩)O~  id=" + id;
    }

    public String circuitBreakerFallback(@PathVariable("id") Integer id) {

        return "id =" + id + ", 不能为负数，o(╥﹏╥)o~ ";
    }

}
