package com.itguigu.factory.simplefactory.pizzastore.order;

import com.itguigu.factory.simplefactory.pizzastore.pizza.Pizza;
import com.itguigu.factory.simplefactory.pizzastore.pizza.SimpleFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description: 简单工厂模式
 * @author: David Allen
 * @date: 2021-04-28
 **/
public class OrderPizza {

    //构造器
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;//订购匹萨的类型
//        do {
//            //orderType = "greek";
//            orderType = getType();
//            if ("greek".equals(orderType)) {
//                pizza = new GreekPizza();
//                pizza.setName("希腊匹萨");
//            } else if ("cheese".equals(orderType)) {
//                pizza = new CheesePizza();
//                pizza.setName("奶酪匹萨");
//            } else if ("pepper".equals(orderType)) {
//                //新增一个胡椒匹萨
//                pizza = new PepperPizza();
//                pizza.setName("胡椒匹萨");
//            } else {
//                break;
//            }
//            //输出pizza的制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

    //定义一个简单工厂对象
    SimpleFactory factory;
    Pizza pizza = null;

    //构造器
    public OrderPizza(SimpleFactory factory) {
        setFactory(factory);
    }

    public void setFactory(SimpleFactory factory) {
        //用户输入的
        String orderType = "";
        //设置简单工厂对象
        this.factory = factory;

        do {
            orderType = getType();
            pizza = this.factory.createPizza(orderType);

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
