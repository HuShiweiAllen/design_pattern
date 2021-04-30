package com.itguigu.factory.absfactory.pizzastore.order;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-29
 **/
public class PizzaStore {

    public static void main(String[] args) {

        //模拟客户端，订购匹萨
        new OrderPizza(new BJFactory());
    }

}
