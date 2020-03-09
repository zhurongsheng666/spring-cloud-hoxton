package com.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/9 23:31
 */
@SpringBootApplication
@MapperScan("com.payment.mapper")
@EnableEurekaClient
public class SlavePaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(SlavePaymentApplication.class);
    }
}
