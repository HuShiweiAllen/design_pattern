package com.itguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-28
 **/
public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("给希腊匹萨 准备原材料");
    }
}
