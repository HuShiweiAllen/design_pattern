package com.itguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-28
 **/
//使用简单工厂模式优化
public class SimpleFactory {

    //根据orderType 返回对应的Pizza对象
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊匹萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪匹萨");
        } else if ("pepper".equals(orderType)) {
            //新增一个胡椒匹萨
            pizza = new PepperPizza();
            pizza.setName("胡椒匹萨");
        }
        return pizza;
    }


    //简单工厂模式 也叫 静态工厂模式
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊匹萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪匹萨");
        } else if ("pepper".equals(orderType)) {
            //新增一个胡椒匹萨
            pizza = new PepperPizza();
            pizza.setName("胡椒匹萨");
        }
        return pizza;
    }

}
