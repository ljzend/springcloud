package com.ljz.goods.controller;

import com.ljz.goods.pojo.Goods;
import com.ljz.goods.vo.CollectionVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @ClassName : GoodsController
 * @Description : 商品控制类
 * @Author : ljz
 * @Date: 2022/7/8  14:52
 */
@RestController
@Slf4j
public class GoodsController {
    @Value("${server.port}")
    private Integer port;

    @GetMapping("/goods")
    public String goods() {
        return "goods is ok~~ " + port;
    }

    /**
     * Query string string.
     * 零散类型参数传递
     * queryString 方式传递 --> http://localhost:8080/goods?name = "" & id = "
     * @param id   the id
     * @param name the name
     * @return the string
     */
    @GetMapping("/show")
    public String queryString(@RequestParam("id") Integer id, @RequestParam("name") String name) {
        return "; queryString: goods的id: " + id + "; goods的name: " + name + "; 服务端口为: " + port;
    }

    /**
     * Path param string.
     * 零散类型参数传递
     * 路径方式进行传参  -->  http://localhost:8080/goods/1
     * @param id   the id
     * @param name the name
     * @return the string
     */
    @GetMapping("/path/{id}/{name}")
    public String pathParam(@PathVariable("id") Integer id, @PathVariable("name") String name){
        return "; pathParam: goods的id: " + id + "; goods的name: " + name + "; 服务端口为: " + port;
    }

    /**
     * Object param string.
     * 对象application/json 形式进行传参
     * @param goods the goods
     * @return the string
     */
    @PostMapping("/add")
    public String objectParam(@RequestBody Goods goods){
        return goods.toString();
    }

    /**
     * Array param string.
     * 使用 @RequestParam 注解进行数组类型参数的传递
     * @param ids the ids
     * @return the string
     */
    @GetMapping("/list")
    public String arrayParam(@RequestParam("ids") String[] ids){
        return Arrays.toString(ids);
    }

    /**
     * List param string.
     * 通过 list 集合进行参数的传递
     * @param collectionVo the collection vo
     * @return the string
     */
    @GetMapping("/List")
    public String listParam(CollectionVo collectionVo){
        collectionVo.getIds().forEach(id -> log.warn("{}", id));
        return "OK!!";
    }

    /**
     * Gets goods.
     * 普通对象 返回值的处理
     * @param id the id
     * @return the goods
     */
    @GetMapping("/test/{id}")
    public Goods getGoods(@PathVariable("id") Integer id){
        return new Goods(id, "零食", 11.11, new Date());
    }

    /**
     * Gets goods list.
     * 返回 List 集合对象， 返回值的处理
     * @param id the id
     * @return the goods list
     */
    @GetMapping("/test1/{id}")
    public List<Goods> getGoodsList(@PathVariable("id") Integer id){
        List<Goods> list = new ArrayList<>();
        Goods goods1 = new Goods(id, "零食", 11.11, new Date());
        Goods goods2 = new Goods(id, "可乐", 22.0, new Date());
        list.add(goods1);
        list.add(goods2);
        return list;
    }

    /**
     * Gets goods map.
     * 返回值 Map 集合， 返回值的处理
     * @param id the id
     * @return the goods map
     */
    @GetMapping("/test2/{id}")
    public Map<String, Object> getGoodsMap(@PathVariable("id") Integer id) throws InterruptedException {
        Map<String, Object> map = new HashMap<>();
        List<Goods> list = new ArrayList<>();
        Goods goods1 = new Goods(id, "零食", 11.11, new Date());
        Goods goods2 = new Goods(id, "可乐", 22.0, new Date());
        list.add(goods1);
        list.add(goods2);
        map.put("total", 1000);
        map.put("record", list);
        return map;
    }
}
