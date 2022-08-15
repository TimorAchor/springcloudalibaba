package com.timor.config;

import com.timor.intercepter.feign.CustomFeignInterceptor;
import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * 加上Configuration是全局配置
 * 去掉是局部配置
 */
//@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

    /**
     * 自定义feign请求拦截器
     * @return
     */
/*    @Bean
    public RequestInterceptor requestInterceptor(){
        return new CustomFeignInterceptor();
    }*/



    /**
     * 全局配置  超时时间配置
     * @return
     */
/*    @Bean
    public Request.Options options(){
        return new Request.Options(5000,10000);
    }*/


    /**
     * 修改契约配置，支持Feign原生的注解
     * @return
     */
   /* @Bean
    public Contract feignContract(){
        return new Contract.Default();
    }*/

}
