package com.itguigu.adapter.interfaceadapter;

/**
 * @description: 客户端-测试接口适配器模式
 * @author: David Allen
 * @date: 2021-05-07
 **/
public class Client {

    public static void main(String[] args) {

        AbsAdapter absAdapter = new AbsAdapter() {
            //这里只需要覆盖，我们需要使用的方法
            @Override
            public void m1() {
                System.out.println("使用了m1方法......");
            }
        };

        absAdapter.m1();
    }

}
