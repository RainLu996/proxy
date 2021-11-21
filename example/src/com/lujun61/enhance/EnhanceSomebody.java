package com.lujun61.enhance;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EnhanceSomebody implements InvocationHandler {
    private Object wantToWasProxy;

    public EnhanceSomebody() {
    }

    public EnhanceSomebody(Object wantToWasProxy) {
        this.wantToWasProxy = wantToWasProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invokeSecretClass = method.invoke(wantToWasProxy, args);
        Integer retVal = 0;

        if (invokeSecretClass != null) {
            /**
             * 开始进行功能增强
             */
            retVal = (Integer) invokeSecretClass;
            retVal = retVal + 666;
        }

        return retVal;
    }
}
