package com.itguigu.factory.simplefactory.pizzastore.order;

import com.itguigu.factory.simplefactory.pizzastore.pizza.Pizza;
import com.itguigu.factory.simplefactory.pizzastore.pizza.SimpleFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description: 使用静态工厂模式
 * @author: David Allen
 * @date: 2021-04-28
 **/
public class OrderPizza2 {

    Pizza pizza = null;
    String orderType = "";

    //构造器
    public OrderPizza2() {

        do {
            orderType = getType();
            //使用静态工厂方法
            pizza = SimpleFactory.createPizza2(orderType);

            if (pizza != null) {
                // 输出pizza的制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购匹萨失败");
                break;
            }
        } while (true);
    }

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
