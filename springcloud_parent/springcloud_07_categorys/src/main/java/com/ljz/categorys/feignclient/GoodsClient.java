package com.ljz.categorys.feignclient;

import com.ljz.categorys.pojo.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "GOODSSERVICE") // value 参数为注册中心的服务名（id）
public interface GoodsClient {

    @GetMapping(value = "/goods")
    String goods();

    @GetMapping(value = "/show")
    String show(@RequestParam("id") Integer id, @RequestParam("name") String name);

    @GetMapping(value = "/path/{id}/{name}")
    String pathParam(@PathVariable("id") Integer id, @PathVariable("name") String name);

    @PostMapping(value = "/add")
    String objectParam(@RequestBody Goods goods);

    @GetMapping(value = "/list")
    String arrayParam(@RequestParam("ids") String[] ids);

    @GetMapping(value = "/List")
    String listParam(@RequestParam("ids") String[] ids);

    @GetMapping(value = "/test/{id}")
    Goods getGoods(@PathVariable("id") Integer id);

    @GetMapping("/test1/{id}")
    List<Goods> getGoodsList(@PathVariable("id") Integer id);

    @GetMapping("/test2/{id}")
    String getGoodsMap(@PathVariable("id") Integer id);
    /*
     *  1、 零散类型参数传递
     *      （1）、queryString 方式传递 --> http://localhost:8080/goods?name = "" & id = "
     *          在 openfeign 的接口声明中必须指定参数的传递方式，即加注解的方式 ? 连接的参数必须加 @RequestParam("必须指定") 注解
     *      （2）、路径方式进行传参  -->  http://localhost:8080/goods/1
     *          在 openfeign 的接口声明中必须指定参数的传递方式，即加注解的方式 / 路径的参数必须加 @PathVariable 注解
     *  2、 对象类型参数传递
     *      （1）、通过 application/json 形式进行传递 可以通过 @requestBody 注解来进行传递
     *      （2）、通过 form 表单形式进行传递
     *  3、 数组类型参数传递
     *      （1）、数组传递的方式只能是 queryString 形式的，所以只需加上 @RequestParam 注解即可
     *  4、 集合类型参数传递
     *      （1）、 服务的提供者：在 springmvc 中不能直接接收集合类型的参数，如果想要接收集合类型的参数，必须将其通过对象的形式进行传递
     *      （2）、 openfeign 端（服务调用端）：和数组传递参数的方式相同，都是通过 @RequestParam 注解进行传递
     *      vo：用来传递数据对象 （通常用来接收请求传过来的参数）
     *      dto：数据传输对象 （通常用来封装统一返回结果）
     *
     *  5、 对象类型的响应结果的处理
     *      （1）、 普通对象：直接返回就行
     *      （2）、 List集合：直接返回结果
     *      （3）、 Map 集合类型：在 openfeign 的调用端直接返回 String 类型， 然后通过 json 反序列化的方式进行处理
     *
     *  6、 openfeign 细节
     *      （1）、   #配置指定服务超时连接时间
     *              feign.client.config.GOODSSERVICE.connect-timeout=6000
     *              #配置指定服务等待超时时间
     *              feign.client.config.GOODSSERVICE.read-timeout=6000
     *              # 配置 openfeign 的默认超时时间
     *              feign.client.config.default.read-timeout=6000
     *              feign.client.config.default.connect-timeout=6000
     *      （2）、 日志功能
     *              # 展示 openfeign 日志
     *              logging.level.com.ljz.categorys=debug
     *              # 配置指定服务的日志级别
     *              feign.client.config.GOODSSERVICE.logger-level=full
     */

}
