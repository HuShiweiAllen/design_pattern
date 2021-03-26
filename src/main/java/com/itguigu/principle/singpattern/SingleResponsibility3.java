package com.itguigu.principle.singpattern;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-03-09
 **/
public class SingleResponsibility3 {

    public static void main(String[] args) {

        Vehicle2 vehicle2 = new Vehicle2();

        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }

}


//方式3的分析
//1 这种修改方法没有对原来的类做大的修改，只增加方法
//2 这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，任然准守单一职责原则
class Vehicle2 {

    public void run(String vehicle) {

        System.out.println(vehicle + "在公路上跑！");
    }

    public void runAir(String vehicle) {

        System.out.println(vehicle + "在空中运行！");
    }

    public void runWater(String vehicle) {

        System.out.println(vehicle + "在水中运行！");
    }
}