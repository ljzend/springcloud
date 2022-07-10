package com.ljz.consul_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : ConsulClientApplication
 * @Description : 启动类
 * @Author : ljz
 * @Date: 2022/7/7  17:30
 */
@SpringBootApplication
@EnableDiscoveryClient // 服务发现注解
public class ConsulClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulClientApplication.class);
    }
}
