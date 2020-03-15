package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/16 00:27
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigSlaveClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigSlaveClientApplication.class);
    }
}
