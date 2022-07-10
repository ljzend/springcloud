package com.ljz.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : OrdersApplication
 * @Description : 启动类
 * @Author : ljz
 * @Date: 2022/7/8  7:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrdersApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrdersApplication.class);
    }
}
