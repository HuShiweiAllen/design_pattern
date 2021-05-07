package com.itguigu.adapter.classadapter;

/**
 * @description: 类适配器
 * @author: David Allen
 * @date: 2021-05-07
 **/
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int output5V() {

        //获取到220V的电压
        int srcV = this.output220V();

        //处理成需要输出的5V电压
        int dstV = srcV / 44;
        return dstV;
    }
}
