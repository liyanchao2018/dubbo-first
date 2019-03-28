package com.luckyli.dubbo.version;

import com.alibaba.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class VersionMain {
    public static void main(String[] args) throws IOException {
        //这里只启动非集群方式的服务
        //启动 provider 项目,spring加载 dubbo-server.xml配置文件; 发布dubbo服务;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/dubbo-server.xml");
        context.start();
        System.in.read();
    }
}
