package com.springcloud.providservera.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("loadbalancer")
public class ProvideServerA {

    @GetMapping("/sayHelloWorld")
    public String sayHelloWorld(){
        return "hello world";
    }

}
