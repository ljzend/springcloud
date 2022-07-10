package com.ljz.openfeign_hystrix.controller;

import com.ljz.openfeign_hystrix.feignclient.HystrixClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName : TestController
 * @Description :
 * @Author : ljz
 * @Date: 2022/7/9  14:48
 */
@RestController
public class TestController {
    @Resource
    private HystrixClient hystrixClient;

    @GetMapping("/test")
    public String test(){
        String test = hystrixClient.test(-1);
        return "ok!!" + test;
    }
}
