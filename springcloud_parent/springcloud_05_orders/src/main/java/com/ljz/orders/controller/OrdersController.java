package com.ljz.orders.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : OrdersController
 * @Description : 订单控制类
 * @Author : ljz
 * @Date: 2022/7/8  8:03
 */
@RestController
public class OrdersController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/orders")
    public String oredersDemo(){
        return "orders is ok !!" + port;
    }
}
