package com.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description: EnableDiscoveryClient,用于向Zk和consul作为注册中心时注册服务
 * @Auther: zhurongsheng
 * @Date: 2020/3/10 23:36
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperApplication.class);
    }
}
