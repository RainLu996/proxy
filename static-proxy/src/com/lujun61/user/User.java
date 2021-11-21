package com.lujun61.user;

import com.lujun61.proxy.TaoBao;

public class User {
    public static void main(String[] args) {
        TaoBao t = new TaoBao();

        System.out.println(t.sell(2));
    }
}
