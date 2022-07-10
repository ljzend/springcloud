package com.ljz.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : GoodsApplication
 * @Description : 启动类
 * @Author : ljz
 * @Date: 2022/7/8  14:43
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class, args);
    }
}
