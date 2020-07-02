package com.zh.pattern.design.strctureMode.bridge;

public class HandsetBrandM extends HandsetBrand {
    @Override
    public void run() {
        handsetSort.run();
    }
}
