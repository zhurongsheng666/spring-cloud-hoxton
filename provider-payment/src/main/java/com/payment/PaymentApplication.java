package com.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/8 01:30
 */
@SpringBootApplication
@MapperScan("com.payment.mapper")
public class PaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class);
    }
}
