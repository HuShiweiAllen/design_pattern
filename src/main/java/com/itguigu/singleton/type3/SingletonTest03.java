package com.itguigu.singleton.type3;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-27
 **/
public class SingletonTest03 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
    }

}


class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    //提供一个静态的公有的方法，当使用到该方法的时候，才去创建instance实例对象
    //即 懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
