package com.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/14 22:27
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class HystrixCustomerApplication {
    public static void main(String[] args) {

        SpringApplication.run(HystrixCustomerApplication.class);
    }
}
