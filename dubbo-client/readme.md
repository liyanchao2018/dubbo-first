
1.url="dubbo://192.168.229.1:20880/com.luckyli.dubbo.IHello"
    <!--url="dubbo://192.168.229.1:20880/com.luckyli.dubbo.IHello" 表示指定dubbo服务地址,不加url 表示 通过dubbo的负载均衡 分配url-->
    <dubbo:reference id="helloService"  interface="com.luckyli.dubbo.IHello"  protocol="dubbo"/>
    
2.当provider 提供集群时,client调用时,结果如下;说明dubbo对于集群,默认提供的是随机负载的服务治理;
Hello,liyanchaoI am HelloImpl2
Hello,liyanchao
Hello,liyanchaoI am HelloImpl2
Hello,liyanchao
Hello,liyanchao
Hello,liyanchao
Hello,liyanchaoI am HelloImpl2
Hello,liyanchaoI am HelloImpl2
Hello,liyanchao
Hello,liyanchaoI am HelloImpl2
Hello,liyanchao