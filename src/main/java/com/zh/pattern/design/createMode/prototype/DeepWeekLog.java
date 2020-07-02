package com.zh.pattern.design.createMode.prototype;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepWeekLog implements Serializable {
    private String date;
    private String name;
    private String content;
    private Attachment attachment;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    /*
    深拷贝：
    通过序列化（Serialization）等方式来进行深度克隆。这个时候要聊一聊什么是序列化了。
    简单的讲就是序列化就将对象写到流的一个过程，写到流里面去（就是字节流）就等于复制了对象，
    但是原来的对象并没有动，只是复制的类型通过流的方式进行读取，然后写到另个内存地址中去！

    如果引用对象的层次不深的话，也可以做嵌套循环浅克隆。
    */
    protected DeepWeekLog deepclone() throws Exception {
        //将对象写入到流中
        ByteOutputStream bos = new ByteOutputStream();
        ObjectOutputStream fos = new ObjectOutputStream(bos);
        fos.writeObject(this);

        //再将对象从流中读取，并存储到新的内存地址中
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream fin = new ObjectInputStream(bis);
        return (DeepWeekLog) fin.readObject();
    }
}
