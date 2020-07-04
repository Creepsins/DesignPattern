package com.zh.pattern.design.strctureMode.composite;

public class Leaf extends Component {
    private String name;
    public Leaf(String name){
        this.name = name;
    }
    @Override
    public void operate(String str) {
        System.out.println(str + "-" + name);
    }

    @Override
    public void addChild(Component child) {

    }

    @Override
    public void removeChild(Component child) {

    }

    @Override
    public Component getChild(int index) {
        return null;
    }
}
