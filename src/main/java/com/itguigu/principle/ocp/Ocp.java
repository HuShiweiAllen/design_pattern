package com.itguigu.principle.ocp;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-25
 **/
public class Ocp {

    public static void main(String[] args) {

        GraphicEditor graphicEditor = new GraphicEditor();

        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());

    }

}

//这是一个用于绘图的类[使用方]
class GraphicEditor {

    //接收Shape对象，然后根据type，来绘制不同的图
    public void drawShape(Shape s) {

        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) {
            drawTriangle(s);
        }

    }

    //绘制矩形
    public void drawRectangle(Shape r) {
        System.out.println("绘制矩形......");
    }

    //绘制圆形
    public void drawCircle(Shape c) {

        System.out.println("绘制圆形......");
    }

    //绘制三角形
    public void drawTriangle(Shape t) {

        System.out.println("绘制三角形......");
    }

}

//Share类，基类
class Shape {

    int m_type;
}

class Rectangle extends Shape {

    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {

    Circle() {
        super.m_type = 2;
    }
}

//新增绘制三角形
class Triangle extends Shape {

    Triangle() {
        super.m_type = 3;
    }
}
