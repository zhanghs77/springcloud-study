package com.zhanghongshan.study.springcloud.dubbo.provider.consumer;

import com.zhanghongshan.study.springcloud.dubbo.provider.module.demo.entity.Demo;
import com.zhanghongshan.study.springcloud.dubbo.provider.module.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zhanghongshan
 * @date 2020/10/27 5:50 下午
 */
@Service
public class DubboServiceConsumer {

    @Autowired
    private DemoService demoService;

    public String sayHello(String name){
        List<Demo> list = demoService.findAll();
        list.forEach(item -> {
            System.out.println(item.getName());
        });
        return name;
    }
}
