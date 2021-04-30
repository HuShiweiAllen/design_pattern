package com.itguigu.builder;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-30
 **/
public abstract class AbstractHouse {

    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    /**
     * 上面三个方法是有顺序的，所有弄一个方法合到一起
     */
    public void build() {

        buildBasic();

        buildWalls();

        roofed();
    }

}
