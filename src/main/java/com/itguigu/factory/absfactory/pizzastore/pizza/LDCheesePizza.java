package com.itguigu.factory.absfactory.pizzastore.pizza;

/**
 * @description: 伦敦奶酪匹萨
 * @author: David Allen
 * @date: 2021-04-28
 **/
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {

        setName("伦敦的奶酪匹萨");
        System.out.println("伦敦的奶酪匹萨 准备原材料");
    }

}
