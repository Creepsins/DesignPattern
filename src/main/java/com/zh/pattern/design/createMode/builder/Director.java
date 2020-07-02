package com.zh.pattern.design.createMode.builder;

public class Director {
    public void construct(Builder builder){
        builder.buildBody();
        builder.buildWheel();
    }
}
