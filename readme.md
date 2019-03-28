1.此项目为dubbo服务提供方和消费方,如需运行,需要分别将 dubbo-server/dubbo-client导入idea中,单独启动;

​	配置文件或子项目中都有readme进行相关基础问题的描述;

```

server-provider通过两种方式来启动容器类服务:

1.spring方式:Bootstrap类 通过ClassPathXmlApplicationContext获取上下文,进行容器实例化;

2.通过dubbo提供的container容器com.alibaba.dubbo.container.Main,进行实例化spring;
    dubbo支持的容器:
        Spring Container
        Jetty Container
        Log4j Container
```

```html
2.针对于 server和clietn的相互依赖的情况, 通过 check=false 来 避免循环依赖的问题;
 <dubbo:reference id="helloService"  interface="com.luckyli.dubbo.IHello" 
                    url="dubbo://192.168.229.1:20880/com.luckyli.dubbo.IHello"
                    check="false"/>
                    
3.dubbo可以支持多种协议的支持:Dubbo(默认)/Hessian/WebService/thirft/RMI


4.dubbo可以支持 同一接口对多语言同时支持提供对外服务,通过protocol表示:
    比如:同时支持 dubbo和hessian
    protocol 可以配置多种协议:dubbo/hessian/rmi/等 
    当前发不出dubbo服务的接口地址   
    3.1 Server端:
    <dubbo:service interface="com.luckyli.dubbo.IHello" ref="helloService" protocol="dubbo,hessian" registry="zk1"/>
    3.2 Client端
     <dubbo:reference id="helloService"  interface="com.luckyli.dubbo.IHello" url="dubbo://192.168.229.1:20880/com.luckyli.dubbo.IHello"
        check="false" protocol="dubbo,hessian"/>
    
    
Server端:
5.dubbo支持多注册中心的设置;
    4.1注册中心: 1. N/A :表示不依赖注册中心 ;
        <!-- <dubbo:registry address="N/A"/>-->
    4.2 配置多注册中心:
        <dubbo:registry id="zk1" address="zookeeper://192.168.229.128:2181"/>
        <dubbo:registry id="zk2" address="zookeeper://192.168.229.129:2181"/>

6. 添加hessian协议的支持,depedency需要的引用:
        <dependency>
            <groupId>com.caucho</groupId>
            <artifactId>hessian</artifactId>
            <version>4.0.38</version>
        </dependency>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>servlet-api</artifactId>
            <version>3.0.1</version>
        </dependency>
        <dependency>
            <groupId>org.mortbay.jetty</groupId>
            <artifactId>jetty</artifactId>
            <version>6.1.26</version>
        </dependency>
        
        
7.hessian基于http协议;dubbo基于nio协议;
```