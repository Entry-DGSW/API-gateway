package com.example.gateway.client.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "auth-service", url = "lb://auth-service")
public class AuthServiceClient {

}
