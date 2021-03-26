package com.itguigu.singleton.type3;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-03-15
 **/
public class SingletonTest03 {

    public static void main(String[] args) {

        //测试
        System.out.println("懒汉式 1 ， 线程不安全");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode()=" + instance1.hashCode());
        System.out.println("instance2.hashCode()=" + instance2.hashCode());

    }


}

class Singleton {

    //1 私有构造方法
    private Singleton() {
    }

    private static Singleton instance;

    // 提供一个静态的公有方法，当使用到该方法时，才去创建instance
    //即懒汉式
    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
