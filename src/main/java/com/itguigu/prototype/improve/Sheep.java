package com.itguigu.prototype.improve;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-29
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sheep implements Cloneable {

    private String name;

    private String color;

    private Integer age;

    private String address = "蒙古羊";

    public Sheep friend;//是对象，克隆是会如何处理，默认是浅度拷贝

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {

        return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", address=" + address
            + "]";
    }

    /**
     * 克隆该实例，使用默认的clone方法来完成
     */
    @Override
    protected Object clone() {

        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }

}
