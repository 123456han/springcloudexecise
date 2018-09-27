package com.springcloud.feignserver.web.rest;

import com.springcloud.feignserver.service.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignInterface feignInterface;

    @GetMapping("/callfeign")
    public String callFeign(){
        return feignInterface.callFeign();
    }
}
