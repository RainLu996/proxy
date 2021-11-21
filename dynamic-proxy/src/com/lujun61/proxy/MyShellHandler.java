package com.lujun61.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description 作为代理类，必须要实现InvocationHandler接口；完成代理类要实现的功能（1、调用目标方法；2、功能增强）
 * @author Jun Lu
 * @date 2021-11-15 22:17:16
 */
public class MyShellHandler implements InvocationHandler {
    private Object target;

    public MyShellHandler() {}

    /**
     * @param target 传入的目标对象
     * @description 目标对象是可以灵活改变的；传入的是谁，就给谁创建对象
     * @author Jun Lu
     * @date 2021-11-15 22:22:19
     */
    public MyShellHandler(Object target) {
        this.target = target;
    }

    /**
     * @param proxy  JDK创建的代理对象，由JDK提供
     * @param method 目标类中的方法，由JDK提供
     * @param args   目标类中方法的参数，由JDK提供
     * @description 功能增强方法
     *
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = method.invoke(target, args);//执行目标方法

        if (res != null) {
            Float price = (Float)res;
            price += 25;
            res = price;
        }

        System.out.println("欢迎光临本店！");

        return res;
    }
}
