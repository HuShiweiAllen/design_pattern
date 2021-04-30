package com.itguigu.factory.absfactory.pizzastore.order;

import com.itguigu.factory.absfactory.pizzastore.pizza.Pizza;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-29
 **/
public class OrderPizza {

    AbsFactory factory;

    //构造器
    public OrderPizza(AbsFactory factory) {

        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;

        do {
            orderType = getType();
            //factory可能是北京的工厂子类，也可能是伦敦的工厂子类
            pizza = factory.createPizza(orderType);

            if (pizza != null) {
                //订购成功
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

    /**
     * 获取用户输入的匹萨类型
     */
    private String getType() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please input pizza kinds!");
        String type = "";
        try {
            type = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return type;
    }

}
