package com.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/15 21:29
 */
@RestController
@RefreshScope
public class ConfigClientRontroller {

    @Value("${config.info}")
    private String info;

    @Value("${server.port}")
    private String port;

    @GetMapping("/info")
    public String info(){
        return "server port："+port+",info："+info;
    }
}
