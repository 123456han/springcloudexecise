package com.springcloud.configclient.web.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClient {

    @Value("${from}")
    private String from;

    @GetMapping("sayConfigClient")
    public String sayConfigClient(){
        return this.from;
    }
}
