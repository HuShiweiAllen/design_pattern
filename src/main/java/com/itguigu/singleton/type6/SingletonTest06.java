package com.itguigu.singleton.type6;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-03-16
 **/
public class SingletonTest06 {

    public static void main(String[] args) {

        System.out.println("双重检查");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() == " + instance1.hashCode());
        System.out.println("instance2.hashCode() == " + instance2.hashCode());

    }

}

//双重检查
class Singleton {

    //私有构造方法
    private Singleton() {
    }

    private static volatile Singleton instance;

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载的问题
    //同时保证了效率，推荐使用
    public static Singleton getInstance() {
        if (instance == null) {

            synchronized (Singleton.class) {
                //保证只有一个线程能进到这里
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}
