package com.itguigu.bridge;

/**
 * @description: 行为的具体实现类
 * @author: David Allen
 * @date: 2021-05-13
 **/
public class Vivo implements Brand {

    @Override
    public void open() {

        System.out.println(" Vivo 手机开机 ");
    }

    @Override
    public void close() {

        System.out.println(" Vivo 手机关机 ");
    }

    @Override
    public void call() {

        System.out.println(" Vivo 手机打电话 ");
    }
}
