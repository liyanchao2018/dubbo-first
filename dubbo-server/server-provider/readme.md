1.BootstrapCluster1/BootstrapCluster2:用于模拟集群服务,dubbo提供服务治理,给client返回一个ip可用的服务方;
2.dubbo 多版本控制
    2.1多版本代码:
        dubbo-server-->dubbo-provider-->version包
    2.2 配置dubbo-provider下的 dubbo-server.xml,添加如下接口:

        <!--  dubbo 多版本控制-->
        <dubbo:service interface="com.luckyli.dubbo.version.IVersionService" ref="versionService"
                       protocol="dubbo" registry="zk1" version="1.0.0"/>
        <bean id="versionService" class="com.luckyli.dubbo.version.VersionServiceImpl"/>
    
        <dubbo:service interface="com.luckyli.dubbo.version.IVersionService" ref="versionService2"
                       protocol="dubbo" registry="zk1" version="2.0.0"/>
        <bean id="versionService2" class="com.luckyli.dubbo.version.VersionServiceImpl2"/>

    2.3 dubbo-client项目:
    
        启动入口类:VersionStart
        dubbo-client 的 dubbo-client.xml添加版本,根据版本号来调用版本迭代的代码;
        <dubbo:reference id="versionService"  interface="com.luckyli.dubbo.version.IVersionService"  protocol="dubbo" version="1.0.0"/>