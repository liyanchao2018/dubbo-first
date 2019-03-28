package com.luckyli.dubbo;

public class HelloImpl2 implements IHello{

    @Override
    public String sayHello(String msg) {
        return "Hello,"+msg+"I am HelloImpl2";
    }
}
