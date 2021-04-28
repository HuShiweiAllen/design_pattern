package com.itguigu.singleton.type5;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-27
 **/
public class SingletonTest05 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());

    }

}

class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {

            synchronized (Singleton.class) {

                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
