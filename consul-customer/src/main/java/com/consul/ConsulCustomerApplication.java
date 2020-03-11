package com.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/12 00:03
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulCustomerApplication {
    public static void main(String[] args) {

        SpringApplication.run(ConsulCustomerApplication.class);
    }

}
