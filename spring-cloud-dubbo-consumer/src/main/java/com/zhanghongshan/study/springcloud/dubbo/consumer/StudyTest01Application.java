package com.zhanghongshan.study.springcloud.dubbo.consumer;

import com.zhanghongshan.study.springcloud.bubbo.api.service.DubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class StudyTest01Application {

    public static void main(String[] args) {
        SpringApplication.run(StudyTest01Application.class, args);
    }

    @RestController
    class TestController{

        @Reference
        private DubboService dubboService;
        @GetMapping("/test/{name}")
        public String test(@PathVariable("name")String name){
            return dubboService.sayHello(name);
        }
    }

}
