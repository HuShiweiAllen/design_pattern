package com.itguigu.factory.simplefactory.pizzastore.pizza;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-28
 **/
//将Pizza类做成抽象类
public abstract class Pizza {

    //匹萨名字
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    //准备原材料，不同的匹萨不一样，因此我们做成抽像方法
    public abstract void prepare();

    //烘烤
    public void bake() {
        System.out.println(name + " baking ......");
    }

    //切割
    public void cut() {
        System.out.println(name + " cutting ......");
    }

    //打包
    public void box() {
        System.out.println(name + " boxing ......");
    }
}
