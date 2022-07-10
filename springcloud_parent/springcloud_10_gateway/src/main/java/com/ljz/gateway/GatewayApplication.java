package com.ljz.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName : GatewayApplication
 * @Description :
 * @Author : ljz
 * @Date: 2022/7/9  16:37
 */
@SpringBootApplication
//@EnableDiscoveryClient
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("category_routes", r -> r.path("/categorys/**")
//                        .uri("http://localhost:8086"))
//                .route("goods_routes", r -> r.host("/goods/**")
//                        .uri("http://localhost:8085"))
//                .build();
//    }
}
