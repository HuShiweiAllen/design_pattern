package com.itguigu.principle.singleresponsibility;

/**
 * @description: 单一职责原则
 * @author: David Allen
 * @date: 2021-04-13
 **/
public class SingleResponsibility1 {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }


}

//交通工具类
//方式1
//1. 在方式1中run方法违反了单一职责原则
//2. 解决方案：根据交通工具运行方式的不同，分解成不同的类
class Vehicle {

    public void run(String vehicleName) {

        System.out.println(vehicleName + "在公路上跑......");
    }
}