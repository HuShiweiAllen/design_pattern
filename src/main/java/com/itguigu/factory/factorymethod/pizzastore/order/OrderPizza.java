package com.itguigu.factory.factorymethod.pizzastore.order;

import com.itguigu.factory.factorymethod.pizzastore.pizza.Pizza;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description: 简单工厂模式
 * @author: David Allen
 * @date: 2021-04-28
 **/
public abstract class OrderPizza {

    //定义一个抽象方法，createPizza，让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    //构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;//订购匹萨的类型
        do {
            orderType = getType();

            //抽象方法，由工厂子类来实现
            pizza = createPizza(orderType);

            //输出pizza的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }


    //写一个方法，可以获取客户希望订购的匹萨种类
    private String getType() {
        String type = "";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("please input pizza type: ");
            type = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return type;
    }
}
