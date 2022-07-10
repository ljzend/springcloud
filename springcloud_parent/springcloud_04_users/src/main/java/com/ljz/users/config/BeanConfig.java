package com.ljz.users.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName : RestTemplateConfig
 * @Description : RestTemplate 配置类
 * @Author : ljz
 * @Date: 2022/7/8  10:37
 */
@Configuration
public class BeanConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate (){
        return new RestTemplate();
    }
}
