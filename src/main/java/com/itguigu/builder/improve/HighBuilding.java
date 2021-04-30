package com.itguigu.builder.improve;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-30
 **/
public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("高楼要打地基要打到 100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼要砌要砌到 20米");
    }

    @Override
    public void roofed() {

        System.out.println("高楼的透明屋顶");
    }
}
