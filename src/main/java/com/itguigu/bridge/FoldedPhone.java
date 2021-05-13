package com.itguigu.bridge;

/**
 * @description: 折叠式手机类，继承 抽象类 Phone
 * 是桥接抽象类的子类
 * @author: David Allen
 * @date: 2021-05-13
 **/
public class FoldedPhone extends Phone {

    //构造器
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println(" 折叠样式手机 ");
    }

    public void close() {
        super.close();
        System.out.println(" 折叠样式手机 ");
    }

    public void call() {
        super.call();
        System.out.println(" 折叠样式手机 ");
    }


}
