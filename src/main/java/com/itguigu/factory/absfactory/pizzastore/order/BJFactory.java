package com.itguigu.factory.absfactory.pizzastore.order;


import com.itguigu.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.itguigu.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.itguigu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-29
 **/
//这是工厂子类
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
