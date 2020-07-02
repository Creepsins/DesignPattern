package com.zh.pattern.design.strctureMode.decorator;

public abstract class CoffeeDecorator implements Coffee{
    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients();
    }
}
