package com.wwwarehouse.contractcenter.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wwwarehouse.contractcenter.service.Greeting;

/**
 * Created by Administrator on 2017/6/8.
 */
@Service
public class GreetingImpl implements Greeting{
    @Override
    public String hello(String name) {
        return "hello:"+name;
    }
}
