package com.zh.pattern.design.strctureMode.facade;

/*
* 外观模式：当系统拥有多个子系统的时候，为了方便客户使用，结构上封装一层统一调用的外观，这种模式叫做外观模式。
* 隐藏了系统的复杂性，并向客户端提供了一个可以访问系统的接口，简单来说，
* 该模式就是把一些复杂的流程封装成一个接口供给外部用户更简单的使用。
* */
public class Clinet14 {
    public static void main(String[] args) {
        ComputerMaker maker = new ComputerMaker(new Cpu(), new Memory(), new Disk());

        maker.computerStart();

        maker.computerStop();
    }
}
