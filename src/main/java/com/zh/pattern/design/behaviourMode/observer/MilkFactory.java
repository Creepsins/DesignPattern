package com.zh.pattern.design.behaviourMode.observer;

public class MilkFactory extends Subject {
    private String state;
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void change(String newState){
        this.state = newState;
        this.notifyChange(newState);
    }
}
