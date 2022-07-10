package com.ljz.openfeign_hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : OpenFeignHystrixApplication
 * @Description :
 * @Author : ljz
 * @Date: 2022/7/9  14:46
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OpenFeignHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignHystrixApplication.class, args);
    }
}
