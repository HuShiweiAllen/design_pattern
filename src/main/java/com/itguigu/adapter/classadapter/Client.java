package com.itguigu.adapter.classadapter;

/**
 * @description: 客户端
 * @author: David Allen
 * @date: 2021-05-07
 **/
public class Client {

    public static void main(String[] args) {

        System.out.println("===类适配器模式===");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());

    }

}
