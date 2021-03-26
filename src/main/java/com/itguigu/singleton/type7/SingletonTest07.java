package com.itguigu.singleton.type7;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-03-16
 **/
public class SingletonTest07 {

    public static void main(String[] args) {

        System.out.println("使用静态内部类完成单例模式...");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode()" + instance1.hashCode());
        System.out.println("instance2.hashCode()" + instance2.hashCode());
    }

}

//静态内部类实现，推荐使用
class Singleton {

    //私有构造方法
    private Singleton() {
    }

    //写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance {

        private static final Singleton INSTANCE = new Singleton();
    }

    //提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
    public static Singleton getInstance() {

        return SingletonInstance.INSTANCE;
    }
}
