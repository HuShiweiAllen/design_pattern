package com.itguigu.bridge;

/**
 * @description: 抽象类，维护了接口（即接口的实现类），这个抽象类充当桥接类
 * @author: David Allen
 * @date: 2021-05-13
 **/
public abstract class Phone {

    //组合品牌
    private Brand brand;

    //构造器
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }

}
