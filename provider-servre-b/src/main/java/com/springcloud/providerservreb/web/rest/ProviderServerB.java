package com.springcloud.providerservreb.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("loadbalancer")
public class ProviderServerB {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/sayHelloWorld")
    public String sayHelloWorld(){
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        return serviceInstance.getHost() + "hello world B";
    }
}
