package com.zh.pattern.design.strctureMode.bridge;

/*
* 桥接模式：将抽象部分与实现部分进行分离解耦，使得二者可以独立变化
* */
public class Client15 {
    public static void main(String[] args) {
        HandsetBrand hb;
        hb = new HandsetBrandM();

        hb.setHandsetSort(new HandsetGame());
        hb.run();

        hb = new HandsetBrandN();
        hb.setHandsetSort(new HandsetAddress());
        hb.run();

    }
}
