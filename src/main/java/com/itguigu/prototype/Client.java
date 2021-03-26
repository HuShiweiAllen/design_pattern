package com.itguigu.prototype;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-03-22
 **/
public class Client {

    public static void main(String[] args) {

        //传统方法处理
        Sheep sheep = new Sheep(2, "tom", "白色");

        Sheep sheep2 = new Sheep(sheep.getAge(), sheep.getName(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getAge(), sheep.getName(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getAge(), sheep.getName(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getAge(), sheep.getName(), sheep.getColor());
        //....
        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
    }

}
