package com.itguigu.prototype;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-29
 **/
public class Client {

    public static void main(String[] args) {

        //传统方法
        Sheep sheep = new Sheep("tom", "白色", 2);

        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getColor(), sheep.getAge());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getColor(), sheep.getAge());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getColor(), sheep.getAge());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getColor(), sheep.getAge());

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
    }
}
