package com.luckyli.dubbo;

import java.io.Serializable;

public class HelloImpl implements IHello{

    @Override
    public String sayHello(String msg) {
        return "Hello,"+msg;
    }
}
