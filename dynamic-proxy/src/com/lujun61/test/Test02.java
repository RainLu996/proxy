package com.lujun61.test;

import java.lang.reflect.InvocationHandler;

public class Test02 {
    /**
     * @param loader 使用反射获取对象的类加载器：类a：a.getClass.getClassLoader();即目标对象的类加载器
     * @param interfaces 使用反射获取目标对象实现的接口
     * @param h 开发者自己写的，代理类要完成的功能
     * @description 创建代理对象
     */
    public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h){return 0;}
}
