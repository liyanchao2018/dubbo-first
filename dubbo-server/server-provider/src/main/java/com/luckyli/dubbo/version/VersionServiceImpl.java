package com.luckyli.dubbo.version;

/**
 * dubbo多版本控制:version 1.0
 */
public class VersionServiceImpl implements IVersionService {
    @Override
    public String showVersion(String msg) {
        return "我是Version 1.0:"+msg;
    }
}
