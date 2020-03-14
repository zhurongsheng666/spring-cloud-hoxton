package com.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/14 21:29
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class HystrixApplication {

    public static void main(String[] args ) {
        SpringApplication.run(HystrixApplication.class);
    }
}
