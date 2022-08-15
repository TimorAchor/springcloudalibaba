package com.timor.feign;

import com.timor.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * name 指定调用rest接口所对应的服务名
 * path 指定调用的rest接口所在的stockController所指定的requestMapping
 */
@FeignClient(name = "stock-service",path = "stock",configuration = FeignConfig.class)
public interface StockFeignService {

    //声明需要调用的rest接口对应的方法
    @RequestMapping("/reduce")
    public String reduce();

}
/*

@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/reduce")
    public String add(){
        System.out.println("减少库存"+port);
        return "减少库存!"+port;
    }

}*/
