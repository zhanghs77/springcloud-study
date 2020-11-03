package com.zhanghongshan.study.springcloud.dubbo.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletRequest;

/**
 * @Author zhanghongshan
 * @date 2020/11/3 4:53 下午
 */
@RestController
@RequestMapping("/api/test/")
public class TestController {

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name){
        RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
        ServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();
        return "hello," + name +":"+ request.getServerPort();
    }
}
