package com.itguigu.factory.factorymethod.pizzastore.order;

import com.itguigu.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.itguigu.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.itguigu.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-28
 **/
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
