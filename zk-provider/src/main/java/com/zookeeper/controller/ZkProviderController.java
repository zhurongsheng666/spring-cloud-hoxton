package com.zookeeper.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/10 23:41
 */
@RestController
public class ZkProviderController {

    @Value("${server.port}")
    private String serverport;

    @RequestMapping("/zk")
    public String zk(){
        return "springcloud with zookeeper: "+serverport;
    }

}
