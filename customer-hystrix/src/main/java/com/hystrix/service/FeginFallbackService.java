package com.hystrix.service;

import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/15 00:25
 */
@Service
public class FeginFallbackService implements FeginService{

    @Override
    public String hello() {
        return "FeginFallbackService invoke hello";
    }


    @Override
    public String threeseconds() {
        return "FeginFallbackService invoke threeseconds";
    }
}
