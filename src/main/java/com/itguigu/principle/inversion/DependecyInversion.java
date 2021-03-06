package com.itguigu.principle.inversion;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-14
 **/
public class DependecyInversion {

    public static void main(String[] args) {

        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {

    public String getInfo() {

        return "电子邮件信息：hello world......";
    }
}

class Person {

    public void receive(Email email) {

        System.out.println(email.getInfo());
    }
}

//完成Person接收消息的功能
//方式1
//1. 比较简单，比较容易想到
//2. 如果我们获取的对象是微信，短信等等，则需要新增类，同时Person也要增加对应的接收方法
//3. 解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类只与接口IReceiver发生依赖
//   因为Email , Weixin等等属于接收的范围，他们各自实现IReceiver接口，就可以了，这样就符合依赖倒转原则

