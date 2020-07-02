package com.zh.pattern.design.createMode.builder;

public class Car2 implements Builder {
    private Car car = new Car();
    @Override
    public void buildBody() {
        car.setBody("玛莎拉蒂车身");
    }

    @Override
    public void buildWheel() {
        car.setWheel("钻石车轮");
    }

    @Override
    public Car getResult() {
        return car;
    }
}
