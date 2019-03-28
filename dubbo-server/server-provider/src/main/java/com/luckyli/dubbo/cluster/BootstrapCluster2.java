package com.luckyli.dubbo.cluster;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 模拟部署dubbo服务接口是集群模式,体现出client调用服务时,dubbo帮我们实现 服务治理的目的:
 * 可以在多个不同IP段的相同\interface服务时,给我们选择出一个IP地址的interface供我们client调用;
 */
public class BootstrapCluster2 {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/dubbo-cluster2.xml");
        context.start();
        System.in.read(); //阻塞当前进程
    }
}
