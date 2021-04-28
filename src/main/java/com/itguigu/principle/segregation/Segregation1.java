package com.itguigu.principle.segregation;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-13
 **/
public class Segregation1 {

    public static void main(String[] args) {

    }

}

//接口
interface Interface1 {

    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("B类实现了operation1方法......");
    }

    @Override
    public void operation2() {
        System.out.println("B类实现了operation2方法......");
    }

    @Override
    public void operation3() {
        System.out.println("B类实现了operation3方法......");
    }

    @Override
    public void operation4() {
        System.out.println("B类实现了operation4方法......");
    }

    @Override
    public void operation5() {
        System.out.println("B类实现了operation5方法......");
    }
}

class D implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("D类实现了operation1方法......");
    }

    @Override
    public void operation2() {
        System.out.println("D类实现了operation2方法......");
    }

    @Override
    public void operation3() {
        System.out.println("D类实现了operation3方法......");
    }

    @Override
    public void operation4() {
        System.out.println("D类实现了operation4方法......");
    }

    @Override
    public void operation5() {
        System.out.println("D类实现了operation5方法......");
    }
}

//A类通过接口Interface1 依赖(使用)B类，但是只会用到1,2,3方法
class A {

    public void depend1(Interface1 interface1) {

        interface1.operation1();
    }

    public void depend2(Interface1 interface1) {

        interface1.operation3();
    }

    public void depend3(Interface1 interface1) {

        interface1.operation3();
    }
}

//C类通过接口Interface1 依赖(使用)D类，但是只会用到1,4,5方法
class C {

    public void depend1(Interface1 interface1) {

        interface1.operation1();
    }

    public void depend4(Interface1 interface1) {

        interface1.operation4();
    }

    public void depend5(Interface1 interface1) {

        interface1.operation5();
    }

}
