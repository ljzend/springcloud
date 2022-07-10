package com.ljz.categorys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : CategorysApplication
 * @Description : 启动类
 * @Author : ljz
 * @Date: 2022/7/8  14:40
 */
@SpringBootApplication
@EnableDiscoveryClient // 开启 consul 服务注册发现
@EnableFeignClients // 开启openfeign远程调用
public class CategorysApplication {
    public static void main(String[] args) {
        SpringApplication.run(CategorysApplication.class, args);
    }
}
