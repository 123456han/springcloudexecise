package com.springcloud.providerservreb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderServreBApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderServreBApplication.class, args);
    }
}
