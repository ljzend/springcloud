package com.ljz.configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName : ConfigsApplication
 * @Description :
 * @Author : ljz
 * @Date: 2022/7/10  9:07
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigsApplication.class, args);
    }
}
