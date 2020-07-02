package com.zh.pattern.design.strctureMode.decorator;

public class CoffeeWithSugar extends CoffeeDecorator {
    public CoffeeWithSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "九分糖";
    }
}
