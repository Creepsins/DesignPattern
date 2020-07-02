package com.zh.pattern.design.strctureMode.bridge;

public abstract class HandsetBrand {
    HandsetSort handsetSort;

    public void setHandsetSort(HandsetSort handsetSort){
          this.handsetSort = handsetSort;
    }

    public abstract void run();
}
