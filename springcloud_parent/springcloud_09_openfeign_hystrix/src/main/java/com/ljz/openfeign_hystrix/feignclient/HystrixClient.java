package com.ljz.openfeign_hystrix.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "HYSTRIXSERVICE", fallback = FallbackClient.class) // 当调用的服务不可用时，备选处理
public interface HystrixClient {

    @GetMapping("/test")
    String test(@RequestParam("id") Integer id);
}
