package com.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/15 01:25
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashbordApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashbordApplication.class);
    }
}
