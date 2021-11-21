package com.lujun61.factory;

import com.lujun61.context.USBSell;

/**
 * @description 实现规定功能的目标类
 * @author Jun Lu
 * @date 2021-11-15 21:06:46
 */
public class FactoryForUSB implements USBSell {
    @Override
    public float sell(float amount) {
        //目标方法
        System.out.println("在目标类中执行sell()目标方法");
        return amount * 85.0f;
    }
}
