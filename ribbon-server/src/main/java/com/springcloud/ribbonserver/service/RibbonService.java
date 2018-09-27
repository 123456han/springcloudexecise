package com.springcloud.ribbonserver.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "sayRibbonFallback")
    public String sayRibbon(){
       return restTemplate.getForEntity("http://PROVIDERSERVERA/loadbalancer/sayHelloWorld", String.class).getBody();
    }

    private String sayRibbonFallback(){
        return "fail";
    }
}
