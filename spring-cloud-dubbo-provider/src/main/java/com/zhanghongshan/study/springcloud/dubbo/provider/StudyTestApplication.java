package com.zhanghongshan.study.springcloud.dubbo.provider;

import com.zhanghongshan.study.springcloud.dubbo.provider.consumer.DubboServiceConsumer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
//注意点
@MapperScan("com.zhanghongshan.study.springcloud.dubbo.provider.module.**.mapper")
public class StudyTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyTestApplication.class, args);
    }

    @RestController
    class EchoController{
        @Autowired
        private DubboServiceConsumer dubboServiceConsumer;

        @GetMapping(value = "/echo/{name}")
        public String echo(@PathVariable String name){
            return dubboServiceConsumer.sayHello(name);
        }
    }

}
