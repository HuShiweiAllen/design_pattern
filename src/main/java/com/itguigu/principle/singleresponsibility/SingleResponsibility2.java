package com.itguigu.principle.singleresponsibility;

/**
 * @description: 单一职责原则
 * @author: David Allen
 * @date: 2021-04-13
 **/
public class SingleResponsibility2 {

    public static void main(String[] args) {

        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}

//方案2的分析
//1. 准守单一职责原则
//2. 但是这样做的改动很大，需要将类分解，同时要修改客户端
//3. 改进：直接修改Vehicle类，这样改动的代码会比较少 ==》方案3

//公路上交通工具类
class RoadVehicle {

    public void run(String vehicleName) {
        System.out.println(vehicleName + "在公路上跑......");
    }
}

//天上交通工具类
class AirVehicle {

    public void run(String vehicleName) {
        System.out.println(vehicleName + "在天上飞......");
    }
}

//水上交通工具类
class WaterVehicle {

    public void run(String vehicleName) {
        System.out.println(vehicleName + "在水上跑......");
    }
}