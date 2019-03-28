package com.luckyli.dubbo;

import java.io.IOException;

/**
 * dubbo也提供container容器,类比与tomcat;
 * 通过com.alibaba.dubbo.container.Main ,不用tomcat也可以启动服务;
 *
 */
public class Main {

    public static void main(String[] args) throws IOException {

        //默认情况下会使用spring容器来启动服务
        com.alibaba.dubbo.container.Main.main( new String[]{"spring","log4j"});


    }

}
