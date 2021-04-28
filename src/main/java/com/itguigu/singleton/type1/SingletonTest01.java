package com.itguigu.singleton.type1;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-27
 **/
public class SingletonTest01 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());

    }

}

//饿汉式(静态变量)
class Singleton {

    //1 构造器私有化，外部能访问
    private Singleton() {
    }

    //2 本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {

        return instance;
    }
}
