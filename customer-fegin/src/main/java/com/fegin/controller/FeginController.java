package com.fegin.controller;

import com.fegin.service.FeginService;
import consts.ResponseResultConsts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/14 18:20
 */
@RestController
@RequestMapping("/fegin")
public class FeginController {

    @Autowired
    private FeginService feginService;


    @GetMapping("")
    public String payment(){
        return  feginService.server();
    }

    @GetMapping("/threeseconds")
    public String threeseconds(){
        return  feginService.threeseconds();
    }

}
