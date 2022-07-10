package com.ljz.openfeign_hystrix.feignclient;

import org.springframework.stereotype.Component;

/**
 * @ClassName : FallbackClient
 * @Description : openfeign 的备选处理方案
 * @Author : ljz
 * @Date: 2022/7/9  15:06
 */
@Component
public class FallbackClient implements HystrixClient{
    @Override
    public String test(Integer id) {
        return id + "服务不可用";
    }
}
