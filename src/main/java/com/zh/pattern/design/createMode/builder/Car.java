package com.zh.pattern.design.createMode.builder;


public class Car {

    private String body;
    private String wheel;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public void show(){
        System.out.println("这辆车由" + body + "和" + wheel + "组成！");
    }
}
