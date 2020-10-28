package com.zhanghongshan.study.springcloud.dubbo.provider.consumer;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author zhanghongshan
 * @date 2020/10/27 5:50 下午
 */
@Component
public class DubboServiceConsumer {

    public String sayHello(String name){
        return name;
    }
}
