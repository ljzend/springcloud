package com.ljz.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : HystrixController
 * @Description :
 * @Author : ljz
 * @Date: 2022/7/9  13:56
 */
@RestController
public class HystrixController {
    @GetMapping("/test")
    @HystrixCommand(fallbackMethod = "a")
    public String test(Integer id){
        System.out.println(id);
        if(id <= 0){
            throw new RuntimeException("id无效!");
        }
        return id.toString();
    }

    public String a(Integer id){
        return "服务被熔断了~~~";
    }
}
