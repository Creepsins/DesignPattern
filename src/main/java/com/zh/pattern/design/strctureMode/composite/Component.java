package com.zh.pattern.design.strctureMode.composite;

public abstract class Component {
    public abstract void operate(String str);

    public abstract void addChild(Component child);
    public abstract void removeChild(Component child);
    public abstract Component getChild(int index);
}
