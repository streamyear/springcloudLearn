package com.xiaoshitou.serviceribbon.controller;

import com.xiaoshitou.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping("hello")
    public String hello(String name){
        System.out.println(applicationName + ": handle program!");
        return helloService.doHi(name);
    }
}
