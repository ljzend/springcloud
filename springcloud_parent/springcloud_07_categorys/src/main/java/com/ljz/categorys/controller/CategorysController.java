package com.ljz.categorys.controller;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.ljz.categorys.feignclient.GoodsClient;
import com.ljz.categorys.pojo.Goods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName : CategorysController
 * @Description : 类别控制类
 * @Author : ljz
 * @Date: 2022/7/8  14:54
 */
@RestController
@Slf4j
public class CategorysController {

    @Value("${server.port}")
    private Integer port;

    @Resource
    private GoodsClient goodsClient;

    @GetMapping("/categorys")
    public String goods() {
        //String goods = goodsClient.goods();
        //String show = goodsClient.show(1, "小里");
        //String param = goodsClient.pathParam(2, "小王");
        //String objectParam = goodsClient.objectParam(new Goods(1, "零食", 12.0, new Date()));
        //String arrayParam = goodsClient.arrayParam(new String[]{"12", "13", "14"});
        //String listParam = goodsClient.listParam(new String[]{"12", "13", "15"});
        //Goods goods1 = goodsClient.getGoods(11);
        //List<Goods> goodsList = goodsClient.getGoodsList(1);
        String goodsMap = goodsClient.getGoodsMap(22);
        System.out.println(goodsMap.getClass());
        JSONObject entries = JSONUtil.parseObj(goodsMap);
        System.out.println(entries);
        Object total = entries.get("total");
        Object record = entries.get("record");
        System.out.println(total);
        System.out.println(record);
        List<Goods> goods2 = JSONUtil.toList(record.toString(), Goods.class);
        goods2.forEach(item -> log.warn("{}", item));
        log.error("{}", port);
        //return "categorys is ok~~ " + port + "\n" + goods;
        //return "categorys is ok~~ " + port + show;
        //return "categorys is ok~~ " + port + param;
        //return "categorys is ok~~ " + port + objectParam;
        //return "categorys is ok~~ " + port + arrayParam;
        //return "categorys is ok~~ " + port + listParam;
        //return goods1.toString();
        return goodsMap;
    }
}
