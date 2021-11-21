package com.lujun61.mainTest;

import com.lujun61.enhance.EnhanceSomebody;
import com.lujun61.interf.SayHello;
import com.lujun61.somebody.SecretClass;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestMyThink {
    public static void main(String[] args) {
        SayHello hello = new SecretClass();

        InvocationHandler enhance = new EnhanceSomebody(hello);

        SayHello proxyInstance = (SayHello)Proxy.newProxyInstance(
                hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(), enhance
        );

        int luJun = proxyInstance.hello("LuJun");
        System.out.println(luJun);
    }
}
