package com.itguigu.principle.inversion.improve;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-14
 **/
public class DependecyInversion {

    public static void main(String[] args) {

        Person person = new Person();
        person.receive(new Email());

        person.receive(new WeiXin());
    }

}

//定义接口
interface IReceiver {

    String getInfo();
}

class Email implements IReceiver {

    @Override
    public String getInfo() {
        return "电子邮件信息：hello world......";
    }
}

class WeiXin implements IReceiver {

    @Override
    public String getInfo() {
        return "微信信息：hello ok......";
    }
}

class Person {

    //依赖接口，不依赖具体是类
    public void receive(IReceiver receiver) {

        System.out.println(receiver.getInfo());
    }
}

//完成Person接收电子邮件消息的功能
//方式2


