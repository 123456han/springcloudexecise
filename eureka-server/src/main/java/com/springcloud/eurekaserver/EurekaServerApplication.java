package com.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        //new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
