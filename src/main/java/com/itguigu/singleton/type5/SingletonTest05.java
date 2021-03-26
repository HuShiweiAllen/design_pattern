package com.itguigu.singleton.type5;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-03-16
 **/
public class SingletonTest05 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() == " + instance1.hashCode());
        System.out.println("instance2.hashCode() == " + instance2.hashCode());

    }

}

//同步代码块的方式（不推荐使用）
class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {

        if (instance == null) {

            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
