package com.luckyli.dubbo.version;

/**
 * dubbo多版本控制:version 2.0
 */
public class VersionServiceImpl2 implements IVersionService {
    @Override
    public String showVersion(String msg) {
        return "我是Version 2.0:"+msg;
    }
}
