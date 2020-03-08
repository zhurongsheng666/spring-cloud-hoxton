package com.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/8 16:20
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
