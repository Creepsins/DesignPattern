package com.zh.pattern.design.strctureMode.adapter;

public class Adapter extends Player{
    private ForeignPlayer foreignPlayer = new ForeignPlayer();
    public Adapter(String name){
        super(name);
        foreignPlayer.setName(name);
    }
    @Override
    public void attack() {
        foreignPlayer.foreignAttach();
    }

    @Override
    public void defense() {
        foreignPlayer.foreignDefense();
    }
}
