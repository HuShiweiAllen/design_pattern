package com.itguigu.factory.absfactory.pizzastore.order;


import com.itguigu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-29
 **/
//一个抽象工厂模式的抽象层（接口）
public interface AbsFactory {

    //让下面的工厂子类来 具体实现
    Pizza createPizza(String orderType);

}
