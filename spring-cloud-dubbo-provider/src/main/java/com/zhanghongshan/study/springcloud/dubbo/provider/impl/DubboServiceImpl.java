package com.zhanghongshan.study.springcloud.dubbo.provider.impl;

import com.zhanghongshan.study.springcloud.bubbo.api.service.DubboService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author zhanghongshan
 * @date 2020/10/27 5:31 下午
 */
@Service
public class DubboServiceImpl implements DubboService {
    @Override
    public String sayHello(String name) {
        System.out.println(name);
        return "say hello " + name;
    }
}
