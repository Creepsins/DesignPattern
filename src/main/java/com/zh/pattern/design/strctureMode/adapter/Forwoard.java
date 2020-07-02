package com.zh.pattern.design.strctureMode.adapter;

public class Forwoard extends Player{
    public Forwoard(String name){
        super(name);
    }
    @Override
    public void attack() {
        System.out.println("球员" + getName() + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("球员" + getName() + "防守");
    }
}
