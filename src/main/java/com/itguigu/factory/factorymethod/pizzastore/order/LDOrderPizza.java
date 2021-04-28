package com.itguigu.factory.factorymethod.pizzastore.order;

import com.itguigu.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.itguigu.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.itguigu.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-28
 **/
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
