package com.itguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-28
 **/
public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给胡椒匹萨准备原材料");
    }
}
