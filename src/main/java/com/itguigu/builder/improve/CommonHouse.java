package com.itguigu.builder.improve;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-30
 **/
public class CommonHouse extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基要打5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙要砌10米");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子要封顶了");
    }
}
