package com.qinchy.contractcenter.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qinchy.contractcenter.service.Greeting;

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
