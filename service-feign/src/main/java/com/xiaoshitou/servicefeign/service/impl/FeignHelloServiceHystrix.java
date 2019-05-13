package com.xiaoshitou.servicefeign.service.impl;

import com.xiaoshitou.servicefeign.service.FeignHelloService;
import org.springframework.stereotype.Service;

@Service
public class FeignHelloServiceHystrix implements FeignHelloService {

    @Override
    public String sayHelloFromWhere(String name) {
        return "Sorry, " + name;
    }
}
