package com.itguigu.factory.factorymethod.pizzastore.pizza;

/**
 * @description: 北京的胡椒匹萨
 * @author: David Allen
 * @date: 2021-04-28
 **/
public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {

        setName("北京的胡椒匹萨");
        System.out.println("北京的胡椒匹萨 准备原材料");
    }

}
