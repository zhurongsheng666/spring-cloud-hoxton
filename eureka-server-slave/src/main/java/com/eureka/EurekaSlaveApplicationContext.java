package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/8 22:24
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaSlaveApplicationContext {
    public static void main(String[] args) {
        SpringApplication.run(EurekaSlaveApplicationContext.class);
    }
}
