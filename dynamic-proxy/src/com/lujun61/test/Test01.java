package com.lujun61.test;

import java.lang.reflect.Method;

public class Test01 {
    /**
     * @param proxy  JDK创建的代理对象，由JDK提供
     * @param method 目标类中的方法，由JDK提供
     * @param args   目标类中方法的参数，由JDK提供
     *
     * 使用方法：
     *   1、创建类实现接口InvocationHandler
     *   2、重写invoke()方法，把原来静态代理中的代理类要实现的功能所需的参数写在“()”中
     *
     * 使用目的：
     *    实现你这个代理的功能
     */
    public Object invoke(Object proxy, Method method, Object[] args) {
        return 0;
    }
}