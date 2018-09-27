package com.springcloud.ribbonserver.web.rest;

import com.springcloud.ribbonserver.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonServer {

    @Autowired
    private RibbonService ribbonService;


    @GetMapping("callRibbonServer")
    public String callRibbonServer(){
        return ribbonService.sayRibbon();
    }
}
