package com.itguigu.prototype.improve;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-03-22
 **/
public class Test {

    /**
     * 优点： 1、新增或修改属性后，需要修改的代码很少
     */

    public static void main(String[] args) {

        System.out.println("使用原型模式克隆羊");
        Sheep sheep = new Sheep(2, "jerry", "蓝色");

        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
    }

}
