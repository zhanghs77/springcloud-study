package com.zhanghongshan.study.springcloud.dubbo.provider.module.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhanghongshan.study.springcloud.dubbo.provider.module.demo.entity.Demo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangmin
 * @since 2020-10-29
 */
public interface DemoService extends IService<Demo> {

    List<Demo> findAll();
}
