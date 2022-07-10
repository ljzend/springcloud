package com.ljz.users.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName : UsersController
 * @Description : 用户控制类
 * @Author : ljz
 * @Date: 2022/7/8  8:02
 */
@RestController
@Slf4j
public class UsersController {
    @Autowired
    private RestTemplate restTemplate;
    /**
     *  服务注册与发现的客户端
     */
    @Resource
    private DiscoveryClient discoveryClient;

    /**
     * ribbon 中的负载均衡的客户端对象 RibbonLoadBalancerClient
     */
    @Resource
    private RibbonLoadBalancerClient loadBalancerClient;

    @GetMapping("/users")
    public String usersDemo(){
        // RestTemplate 实现远程调用接口
        //String object = restTemplate.getForObject("http://localhost:8084/orders", String.class);

        // Ribbon + RestTemplate 实现接口的远程调用，实现负载均衡

        // 1、DiscoveryClient 服务注册与发现的客户端
//        List<ServiceInstance> ordersservice = discoveryClient.getInstances("ORDERSSERVICE");
//        ordersservice.forEach(item -> log.info("--> {}", item.getUri()));
//        String forObject = restTemplate.getForObject(ordersservice.get(0).getUri() + "/orders", String.class);

        // 2、 ribbon 中的负载均衡的客户端对象 RibbonLoadBalancerClient
//        ServiceInstance choose = loadBalancerClient.choose("ORDERSSERVICE");
//        String forObject1 = restTemplate.getForObject(choose.getUri() + "/orders", String.class);

        // 3、 使用@LoadBalanced注解实现负载均衡
        String forObject2 = restTemplate.getForObject("http://ORDERSSERVICE/orders", String.class);
        return "users is ok!!" + forObject2;
    }
}
