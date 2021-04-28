package com.itguigu.principle.inversion.improve;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-14
 **/
public class DependencyPass {

    public static void main(String[] args) {

    }
}

//方式1，通过接口传递实现依赖
//开关接口
interface IOPenAndClose {

    void open(ITV tv);//抽象方法，接收接口
}

//ITV接口
interface ITV {

    void play();
}

//实现接口
class OpenAndClose implements IOPenAndClose {

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}

//方式2，通过构造方法依赖传递
//interface IOpenAndClose {
//
//    void open();//抽象方法
//}
//
//interface ITV {
//
//    void play();
//}
//
//class OPenAndClose implements IOpenAndClose {
//
//    private ITV tv;
//
//    //通过构造方法，去传递依赖接口
//    public OPenAndClose(ITV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//
//        tv.play();
//    }
//}

//方式3，通过setter方法传递
//interface IOpenAndClose {
//
//    void open();
//
//    void setTv(ITV tv);
//}
//
////ITV接口
//interface ITV {
//
//    void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//
//    private ITV tv;
//
//    @Override
//    public void setTv(ITV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//        this.tv.play();
//    }
//}
