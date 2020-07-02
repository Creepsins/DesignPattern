package com.zh.pattern.design.strctureMode.adapter;

public abstract class Player {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Player(String name){
        this.name = name;
    }

    public abstract void attack();
    public abstract void defense();
}
