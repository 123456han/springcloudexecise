package com.springcloud.feignserver.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "providerservera", fallback = FeignInterface.FailFeign.class)
public interface FeignInterface {

    @GetMapping("/loadbalancer/sayHelloWorld")
    String callFeign();

    @Component
    class FailFeign implements  FeignInterface{
        @Override
        public String callFeign() {
            return "feign fail";
        }
    }
}
