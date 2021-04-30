package com.itguigu.factory.absfactory.pizzastore.order;


import com.itguigu.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.itguigu.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.itguigu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-29
 **/
//这是工厂子类
public class LDFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)){
            pizza = new LDCheesePizza();
        }else if("pepper".equals(orderType)){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
