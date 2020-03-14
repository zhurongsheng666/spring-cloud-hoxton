package com.fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/14 17:21
 */
@SpringBootApplication
@EnableFeignClients
public class FeginApplication {

    public static void main(String[] args) {

        SpringApplication.run(FeginApplication.class);
    }
}
