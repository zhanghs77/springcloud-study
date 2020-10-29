package com.zhanghongshan.study.springcloud.dubbo.provider.module.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhanghongshan.study.springcloud.dubbo.provider.module.demo.entity.Demo;
import com.zhanghongshan.study.springcloud.dubbo.provider.module.demo.mapper.DemoMapper;
import com.zhanghongshan.study.springcloud.dubbo.provider.module.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangmin
 * @since 2020-10-29
 */
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public List<Demo> findAll(){
        return demoMapper.selectList(null);
    }
}
