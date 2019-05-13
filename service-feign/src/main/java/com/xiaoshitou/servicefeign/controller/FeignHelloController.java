package com.xiaoshitou.servicefeign.controller;

import com.xiaoshitou.servicefeign.service.FeignHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHelloController {
    @Autowired
    FeignHelloService feignHelloService;

    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping("feign/hello")
    public String hello(String name){
        System.out.println(applicationName + ": handle program!");
        return feignHelloService.sayHelloFromWhere(name);
    }
}
