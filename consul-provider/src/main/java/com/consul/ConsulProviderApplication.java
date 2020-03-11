package com.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/11 23:42
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConsulProviderApplication.class);
    }

}
