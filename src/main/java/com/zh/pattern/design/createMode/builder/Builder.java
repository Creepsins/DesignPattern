package com.zh.pattern.design.createMode.builder;

public interface Builder {
    void buildBody();
    void buildWheel();
    Car getResult();
}
