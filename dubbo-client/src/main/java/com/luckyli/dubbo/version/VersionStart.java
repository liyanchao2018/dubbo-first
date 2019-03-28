package com.luckyli.dubbo.version;

import com.luckyli.dubbo.IHello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VersionStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        //单机provider下 直接 执行此处即可
        IVersionService versionService = (IVersionService) context.getBean("versionService");
        System.out.println( versionService.showVersion("liyanchao"));
//        System.in.read();
    }
}
