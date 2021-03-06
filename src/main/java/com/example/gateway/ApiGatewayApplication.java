package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        System.setProperty("reactor.netty.http.server.accessLogEnabled", "true");
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
