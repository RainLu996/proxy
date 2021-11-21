package com.lujun61.user;

import com.lujun61.context.USBSell;
import com.lujun61.factory.FactoryForUSB;
import com.lujun61.proxy.MyShellHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {
    public static void main(String[] args) {
        /*
            在业务中，1步骤：用来获取人家写好的功能代码
                     2步骤：用来先写好一个你自己对人家写的代码的增强
                     3步骤：创建一个代理方法，所用的，就是你在2步骤写好的功能增强方法
                     4步骤：指明想要执行的方法
         */

        /**
         * 1、通过目标类创建目标对象
         */
        USBSell factory = new FactoryForUSB();

        /**
         * 2、创建InvocationHandler对象
         * 作用：完成增强功能
         * 即：通过我实现的MyShellHandler增强功能的方法，来增强factory
         */
        InvocationHandler handler = new MyShellHandler(factory);

        /**
         * 3、为factory创建代理对象（需要传入增强的方法）
         */
        /** 解释newProxyInstance方法
         * @param loader 使用反射获取目标对象的类加载器：类a：a.getClass.getClassLoader();即目标对象的类加载器
         * @param interfaces 使用反射获取目标对象实现的接口
         * @param h 开发者自己写的，代理类要完成的功能
         * @description 创建代理对象
         */
        USBSell useShell = (USBSell) Proxy.newProxyInstance(factory.getClass().getClassLoader(),
                factory.getClass().getInterfaces(), handler);

        /**
         * 4、通过代理执行方法
         */
        float price = useShell.sell(2);
        System.out.println(price);
    }
}