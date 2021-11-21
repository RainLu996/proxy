package com.lujun61.business;

import com.lujun61.service.USBProtocol;

public class Business implements USBProtocol {

    @Override
    public float sell(int amount) {
        float single = 85.0f;
        return single * amount;
    }
}
