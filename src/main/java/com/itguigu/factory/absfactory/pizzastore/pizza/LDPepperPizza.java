package com.itguigu.factory.absfactory.pizzastore.pizza;

/**
 * @description: 伦敦胡椒匹萨
 * @author: David Allen
 * @date: 2021-04-28
 **/
public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {

        setName("伦敦的胡椒匹萨");
        System.out.println("伦敦的胡椒匹萨 准备原材料");
    }
}
