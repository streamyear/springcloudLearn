package com.xiaoshitou.servicefeign.service;

import com.xiaoshitou.servicefeign.service.impl.FeignHelloServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", fallback = FeignHelloServiceHystrix.class)
public interface FeignHelloService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHelloFromWhere(@RequestParam("name") String name);
}
