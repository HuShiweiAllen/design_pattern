package com.itguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-28
 **/
public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("给制作奶酪匹萨 准备原材料");
    }
}
