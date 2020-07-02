package com.zh.pattern.design.createMode.prototype;

public class WeekLog implements Cloneable{
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


    //使用Object类的clone()方法实现浅克隆
    @Override
    protected WeekLog clone() throws CloneNotSupportedException {
        try {
            Object obj = null;
            obj = super.clone();
            return (WeekLog)obj;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
