package com.lujun61.proxy;

import com.lujun61.business.Business;
import com.lujun61.service.USBProtocol;

public class TaoBao implements USBProtocol {
    /**
     * 只有商家才能和对应的厂家联系供应货物
     */
    private final Business b = new Business();

    @Override
    public float sell(int amount) {
        float bnsMoney = b.sell(amount);

        return bnsMoney + amount * 25;
    }
}
