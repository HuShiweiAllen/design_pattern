package com.itguigu.principle.ocp.improve;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-03-10
 **/
public class Ocp2 {

    public static void main(String[] args) {

        //使用看看存在的问题
        GraphicEditor2 graphicEditor2 = new GraphicEditor2();
        graphicEditor2.drawShape(new Rectangle2());
        graphicEditor2.drawShape(new Circle2());
        graphicEditor2.drawShape(new Triangle2());
        graphicEditor2.drawShape(new OtherGraphic2());

    }

}

//这是一个用于绘图的类[使用方]
class GraphicEditor2 {

    //接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape2 s) {

        s.draw();
    }

}

//Shape类，是一个基类
interface Shape2 {

    void draw();//抽象方法

}

class Rectangle2 implements Shape2 {

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle2 implements Shape2 {

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

//新增画三角形
class Triangle2 implements Shape2 {

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

//新增一个其它图形
class OtherGraphic2 implements Shape2 {

    @Override
    public void draw() {
        System.out.println("绘制其它图形");
    }
}
