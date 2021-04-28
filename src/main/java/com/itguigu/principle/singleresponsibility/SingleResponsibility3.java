package com.itguigu.principle.singleresponsibility;

/**
 * @description: 单一职责原则
 * @author: David Allen
 * @date: 2021-04-13
 **/
public class SingleResponsibility3 {

    public static void main(String[] args) {

        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }

}

//交通工具类2
//方式3的分析
//1. 这种修改方法没有对原来的类做大的修改，只是增加了方法
//2. 这种方案虽然没有在类这个级别上准守单一职责原则，但是在方法级别上，仍然是准守单一职责原则的
class Vehicle2 {

    public void runRoad(String vehicleName) {
        System.out.println(vehicleName + "在公路上跑......");
    }

    public void runAir(String vehicleName) {
        System.out.println(vehicleName + "在天上飞......");
    }

    public void runWater(String vehicleName) {
        System.out.println(vehicleName + "在水上跑......");
    }
}