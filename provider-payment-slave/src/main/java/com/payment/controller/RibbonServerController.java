package com.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ribbon")
public class RibbonServerController {
 
    @Value("${server.port}")
    private String port;


    @GetMapping("/server")
    public String server(){
        return "ribbon server port is "+port;
    }
}