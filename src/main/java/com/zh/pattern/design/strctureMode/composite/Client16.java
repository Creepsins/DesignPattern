package com.zh.pattern.design.strctureMode.composite;

/*
*   组合模式：组合多个对象形成树形结构以表示有整体-部分关系层次结构，组合模式可以让客户端统一对待单个对象和组合对象
*
*   抽象组件(Component)角色：为组合对象和叶子对象声明公共的接口，让客户端可以通过这个接口来访问和管理整个对象树，
*   并可以为这些定义的接口提供缺省的实现。
*
    组合对象(Composite)角色：通常会存储子组件(组合对象、叶子对象)，定义包含子组件的那些组件的行为，并实现在抽象组件中
    定义的与子组件有关的操作，例如子组件的添加(addChild)和删除(removeChild)等。

    叶子对象(Leaf)角色：定义和实现叶子对象的行为，并且它不再包含其他的子节点对象。
* */
public class Client16 {
    public static void main(String[] args) {
        //定义多个组合对象
        Component root = new Composit("服装");
        Component c1 = new Composit("男装");
        Component c2 = new Composit("女装");
        Component c3 = new Composit("母婴");

        // 定义多个Leaf叶子对象
        Component leaf1 = new Leaf("西服");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("衬衫");
        Component leaf4 = new Leaf("裙子");
        Component leaf5 = new Leaf("套装");
        Component leaf6 = new Leaf("鞋袜");
        Component leaf7 = new Leaf("孕妇装");
        Component leaf8 = new Leaf("婴儿装");

        // 组合成为树形的对象结构
        root.addChild(c1);
        root.addChild(c2);
        root.addChild(c3);

        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c1.addChild(leaf3);

        c2.addChild(leaf4);
        c2.addChild(leaf5);
        c2.addChild(leaf6);

        c3.addChild(leaf7);
        c3.addChild(leaf8);

        root.operate("");
    }
}
