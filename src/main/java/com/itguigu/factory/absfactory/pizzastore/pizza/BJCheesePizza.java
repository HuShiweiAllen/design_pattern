package com.itguigu.factory.absfactory.pizzastore.pizza;

/**
 * @description: 北京奶酪匹萨
 * @author: David Allen
 * @date: 2021-04-28
 **/
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {

        setName("北京的奶酪匹萨");
        System.out.println("北京的奶酪匹萨 准备原材料");
    }
}
