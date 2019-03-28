package com.luckyli.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Bootstrap {

    public static void main(String[] args) throws IOException {
        //启动 provider 项目,spring加载 dubbo-server.xml配置文件; 发布dubbo服务;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/dubbo-server.xml");
        context.start();
        System.in.read();

        /**
         * 启动信息:
         * 信息:  [DUBBO]
         * Export dubbo service com.luckyli.dubbo.IHello to url dubbo://192.168.229.1:20880/com.luckyli.dubbo.IHello?anyhost=true&application=dubbo-server&dubbo=2.5.3&interface=com.luckyli.dubbo.IHello&methods=sayHello&owner=lyc&pid=26380&side=provider&timestamp=1553749121024, dubbo version: 2.5.3, current host: 127.0.0.1
         * 三月 28, 2019 12:58:41 下午 com.alibaba.dubbo.common.logger.jcl.JclLogger info
         * 信息:  [DUBBO] Start NettyServer bind /0.0.0.0:20880, export /192.168.229.1:20880, dubbo version: 2.5.3, current host: 127.0.0.1
         *
         * 协议地址:  //ip:port  /interfaceName
         * dubbo://192.168.229.1:20880/com.luckyli.dubbo.IHello
         */
    }
}
