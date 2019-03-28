package com.luckyli.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");

        //默认情况下 dubbo 使用的是随机负载选择provider给client调用
        for (int i=0;i<10; i++ ){
            IHello hello = (IHello) context.getBean("helloService");
            System.out.println( hello.sayHello("liyanchao"));
            Thread.sleep(1000);
        }
       //单机provider下 直接 执行此处即可
        IHello hello = (IHello) context.getBean("helloService");
        System.out.println( hello.sayHello("liyanchao"));
//        System.in.read();
    }
}
