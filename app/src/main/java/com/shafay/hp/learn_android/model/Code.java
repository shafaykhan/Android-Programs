package com.shafay.hp.learn_android.model;

public class Code {
    private int id;
    private String title;
    private int img;
    private String group;
    private Class<?> executeClass;

    public Code(int id, String title, int img, String group, Class<?> executeClass) {
        this.id = id;
        this.title = title;
        this.img = img;
        this.group = group;
        this.executeClass = executeClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Class<?> getExcecuteClass() {
        return executeClass;
    }

    public void setExecuteClass(Class<?> excecuteClass) {
        this.executeClass = excecuteClass;
    }

    public Class<?> getExecuteClass() {
        return executeClass;
    }
}
