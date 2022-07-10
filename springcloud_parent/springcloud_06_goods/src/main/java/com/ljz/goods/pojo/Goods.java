package com.ljz.goods.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName : goods
 * @Description : 商品实体类
 * @Author : ljz
 * @Date: 2022/7/8  17:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private Integer id;
    private String name;
    private Double price;
    private Date date;
}
