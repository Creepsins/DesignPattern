package com.zh.pattern.design.createMode.builder;

public class Car1 implements Builder {
    private Car car = new Car();
    @Override
    public void buildBody() {
        car.setBody("奥迪车身");
    }

    @Override
    public void buildWheel() {
        car.setWheel("黄金车轮");
    }

    @Override
    public Car getResult() {
        return car;
    }
}
