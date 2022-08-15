package com.timor.controller;

import com.timor.feign.ProductFeignService;
import com.timor.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    StockFeignService stockFeignService;
    @Autowired
    ProductFeignService productFeignService;


    @RequestMapping("/add")
    public String add(){
        String msg = stockFeignService.reduce();

        String product = productFeignService.get(1);

        return "Hello Feign!"+msg+product;
    }


}
