package com.example.gateway.client;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CommonFeignErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        return new Exception("feign Error");
    }
}
