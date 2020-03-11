package com.consul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/12 00:07
 */
@RestController
@RequestMapping("/consul")
public class CustomerController {

    public static final String PROVIDER_URL="http://consul-provider";


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/customer")
    public String customer(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity(PROVIDER_URL+"/consul", String.class);
        return forEntity.getBody();
    }

}
