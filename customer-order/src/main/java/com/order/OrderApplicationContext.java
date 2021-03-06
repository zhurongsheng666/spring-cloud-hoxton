package com.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/8 16:07
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderApplicationContext {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplicationContext.class);
    }
}
