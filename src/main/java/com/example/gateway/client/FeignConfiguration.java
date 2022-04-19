package com.example.gateway.client;

import feign.Logger;
import feign.codec.ErrorDecoder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.*;

//@EnableFeignClients(basePackages = "com.example.gateway.client")
@Import(CommonFeignErrorDecoder.class)
@Configuration
public class FeignConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }

    @Bean
    @ConditionalOnMissingBean(value = ErrorDecoder.class)
    public CommonFeignErrorDecoder commonFeignErrorDecoder() {
        return new CommonFeignErrorDecoder();
    }
}
