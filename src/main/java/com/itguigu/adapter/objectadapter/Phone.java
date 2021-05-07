package com.itguigu.adapter.objectadapter;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-05-07
 **/
public class Phone {

    //充电
    public void charging(Voltage5V voltage5V) {

        int output5V = voltage5V.output5V();
        if (output5V == 5) {
            System.out.println("电压为5伏，可以充电......");
        } else if (output5V > 5) {
            System.out.println("电压大于5伏，不能充电......");
        }
    }

}
