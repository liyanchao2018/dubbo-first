package com.luckyli.dubbo.mock;

import com.luckyli.dubbo.IHello;

public class TestMock implements IHello {
    @Override
    public String sayHello(String msg) {
        return "MOCK服务降级:由于当前请求dubbo服务太多,dubbo通过mock实现一个兜底的调用返回给客户,请客户稍后重试等操作;"+msg;
    }
}
