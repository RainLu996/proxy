package com.lujun61.somebody;

import com.lujun61.interf.SayHello;

public class SecretClass implements SayHello {
    @Override
    public int hello(String name) {
        System.out.println("Hello! " + name);

        return 2;
    }
}
