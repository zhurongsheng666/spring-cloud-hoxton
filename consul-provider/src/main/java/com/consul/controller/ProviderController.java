package com.consul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/11 23:47
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    private String serverport;

    @RequestMapping("/consul")
    public String zk(){
        return "springcloud with consul: "+serverport;
    }
}
