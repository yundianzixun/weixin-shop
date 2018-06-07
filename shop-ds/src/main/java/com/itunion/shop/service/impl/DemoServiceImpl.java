package com.itunion.shop.service.impl;


import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.rpc.RpcContext;
import com.itunion.shop.service.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试demo-服务提供方
 * Created by lin on 2018年04月16日21:38:07
 */
public class DemoServiceImpl implements DemoService {
	private final static Logger LOGGER = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

}
