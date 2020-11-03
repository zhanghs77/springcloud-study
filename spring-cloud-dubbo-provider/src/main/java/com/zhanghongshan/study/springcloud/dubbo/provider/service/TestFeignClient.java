package com.zhanghongshan.study.springcloud.dubbo.provider.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author zhanghongshan
 * @date 2020/11/3 5:00 下午
 */
@Component
//消费端api
@FeignClient(name = "study-test01",path = "/api/test/")
public interface TestFeignClient {
    @GetMapping("/sayHello/{name}")
    String sayHello(@PathVariable("name") String name);
}
