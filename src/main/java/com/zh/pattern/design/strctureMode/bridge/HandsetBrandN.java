package com.zh.pattern.design.strctureMode.bridge;

public class HandsetBrandN extends HandsetBrand {
    @Override
    public void run() {
        handsetSort.run();
    }
}
