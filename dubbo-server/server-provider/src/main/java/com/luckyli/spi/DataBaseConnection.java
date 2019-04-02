package com.luckyli.spi;

import java.util.ServiceLoader;

/**
 * 通过SPI插件方式 扩展我们的服务
 */
public class DataBaseConnection {
    public static void main(String[] args) {
        ServiceLoader<DataBaseDriver> serviceLoader = ServiceLoader.load(DataBaseDriver.class);
        for(DataBaseDriver driver : serviceLoader){
            System.out.println(driver.Connect("localhost"));
        }
    }
}
