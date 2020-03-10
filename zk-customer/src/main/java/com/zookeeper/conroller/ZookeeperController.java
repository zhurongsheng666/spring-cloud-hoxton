package com.zookeeper.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/11 00:37
 */
@RestController
@RequestMapping("/zk")
public class ZookeeperController {


    public static final String PROVIDER_URL="http://zk-provider";


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/customer")
    public String customer(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity(PROVIDER_URL+"/zk", String.class);
        return forEntity.getBody();
    }

}
