package com.zh.pattern.design.strctureMode.composite;

import java.util.ArrayList;
import java.util.List;

public class Composit extends Component{
    private String name;

    private List<Component> childComponents = new ArrayList<>();

    public Composit(String name) {
        this.name = name;
    }

    @Override
    public void operate(String str) {
        //输出根部
        System.out.println(str + " + " + name);
        if (childComponents != null && childComponents.size() > 0){
            str += " ";
            //输出当前对象的子对象
            for (Component component : childComponents){
                component.operate(str);
            }
        }
    }

    @Override
    public void addChild(Component child) {
        childComponents.add(child);
    }

    @Override
    public void removeChild(Component child) {
        childComponents.remove(child);
    }

    @Override
    public Component getChild(int index) {
        if (childComponents != null){
            if (index >= 0 && index < childComponents.size()){
                return childComponents.get(index);
            }
        }
        return null;
    }
}
