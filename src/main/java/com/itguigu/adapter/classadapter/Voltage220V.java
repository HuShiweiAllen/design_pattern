package com.itguigu.adapter.classadapter;

/**
 * @description: 被适配的类
 * @author: David Allen
 * @date: 2021-05-07
 **/
public class Voltage220V {

    public int output220V() {
        //输出220V电压
        int src = 220;
        System.out.println("电压 = " + src + "伏");
        return src;
    }

}
