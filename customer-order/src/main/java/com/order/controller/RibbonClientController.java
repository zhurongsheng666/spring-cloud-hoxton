package com.order.controller;

import consts.ResponseResultConsts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/14 10:57
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonClientController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String RIBBON_SERVER_URL = "http://provider-payment-service/ribbon/server";

    @GetMapping("/client")
    public String client() {
        ResponseEntity<String> response =
                restTemplate.getForEntity(RIBBON_SERVER_URL, String.class);
        return response.getBody();
    }

}
