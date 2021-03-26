package com.itguigu.singleton.type8;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-03-16
 **/
public class SingletonTest08 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() == " + instance1.hashCode());
        System.out.println("instance2.hashCode() == " + instance2.hashCode());

        instance1.sayOK();

    }

}

//使用枚举实现单例，推荐使用
enum Singleton {

    INSTANCE;

    public void sayOK() {

        System.out.println("ok ~");
    }
}
