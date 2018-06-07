package com.itunion.shop.web.controller;

import com.itunion.shop.service.DemoService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 开发者服务
 * Created by lin on 2018年06月06日17:18:32
 */
@Controller
@RequestMapping("demoPC")
@Api(description = "测试PC")
public class DemoController {
    private Logger logger = LoggerFactory.getLogger(DemoController.class);
    @Autowired
    DemoService demoService;

    public static void main(String[] args) {
        //Prevent to get IPV6 address,this way only work in debug mode
        //But you can pass use -Djava.net.preferIPv4Stack=true,then it work well whether in debug mode or not
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"shop-pc-consumer.xml"});
        context.start();
        System.out.println("微商城PC端-消费方（Consumer）启动......");
        DemoService demoService = (DemoService) context.getBean("demoService"); // get remote service proxy
        System.out.println("消费方（Consumer）");
        while (true) {
            try {
                Thread.sleep(1000);
                String hello = demoService.sayHello("第1个：我是PC端消费方"); // call remote method
                System.out.println(hello); // get result

            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }


        }

    }
}
