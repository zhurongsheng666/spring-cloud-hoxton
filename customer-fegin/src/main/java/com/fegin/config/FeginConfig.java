package com.fegin.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/14 18:54
 */
@Configuration
public class FeginConfig {

    @Bean
    Logger.Level feginLoggerLevel(){
        return Logger.Level.FULL;
    }

}
