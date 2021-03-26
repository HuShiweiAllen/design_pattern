package com.itguigu.prototype.improve;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-03-22
 **/
public class Sheep implements Cloneable {

    private int age;
    private String name;
    private String color;

    public Sheep(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
            "age=" + age +
            ", name='" + name + '\'' +
            ", color='" + color + '\'' +
            '}';
    }

    //克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone() {
        //return super.clone();
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
