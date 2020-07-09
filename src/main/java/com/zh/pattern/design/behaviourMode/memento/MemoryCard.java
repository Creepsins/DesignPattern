package com.zh.pattern.design.behaviourMode.memento;

public class MemoryCard {
    //生命值
    private int health;
    //魔法值
    private int mana;

    public MemoryCard(int health, int mana) {
        this.health = health;
        this.mana = mana;
    }

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

}
