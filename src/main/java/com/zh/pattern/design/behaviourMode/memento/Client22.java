package com.zh.pattern.design.behaviourMode.memento;

/*
 *   备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象外保存这个状态，这样以后可将此对象恢复成原来的状态。
 *
 *   原发器类（Originator）：创建一个备忘录对象，使用备忘录存储它的内部状态。

     负责人类（CareTaker）：负责保存好备忘录对象，不能检查或操作备忘录的内容。

     备忘录类（Memento）：将原发器的内部状态存储起来，原发器根据需要决定备忘录存储原发器的哪些内部状态。
 * */
public class Client22 {
    public static void main(String[] args) {
        //初始化状态
        Dante dante = new Dante();
        dante.getInitState();
        dante.showState();

        MemoryCardCreataker cardCreataker = new MemoryCardCreataker();
        cardCreataker.setMemoryCard(dante.saveState());

        dante.deathState();
        dante.showState();

        dante.recoveryState(cardCreataker.getMemoryCard());
        dante.showState();
    }
}
