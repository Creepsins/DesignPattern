package com.zh.pattern.design.strctureMode.adapter;

public class ForeignPlayer {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public void foreignAttach(){
       System.out.println("外籍球员" + getName() + "进攻");
   }

    public void foreignDefense(){
        System.out.println("外籍球员" + getName() + "防守");
    }
}
