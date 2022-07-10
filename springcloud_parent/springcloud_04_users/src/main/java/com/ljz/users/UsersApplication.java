package com.ljz.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : UsersApplication
 * @Description : 启动类
 * @Author : ljz
 * @Date: 2022/7/8  7:43
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UsersApplication {
    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class);
    }
}
