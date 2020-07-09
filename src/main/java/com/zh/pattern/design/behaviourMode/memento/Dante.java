package com.zh.pattern.design.behaviourMode.memento;

public class Dante {
    //生命值
    private int health;
    //魔法值
    private int mana;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    //角色的初始状态
    public void getInitState(){
        this.health = 100;
        this.mana = 100;
    }

    public void showState(){
        System.out.println("health:"+health+",mana:"+mana);
    }

    public void deathState(){
        this.health = 0;
        this.mana = 0;
    }

    public MemoryCard saveState(){
        return new MemoryCard(health, mana);
    }

    public void recoveryState(MemoryCard memoryCard){
        this.health = memoryCard.getHealth();
        this.mana = memoryCard.getMana();
    }
}
