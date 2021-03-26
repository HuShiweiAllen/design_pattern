package com.itguigu.principle.inversion.inprove;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-03-09
 **/
public class DependencyInversion {

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

        return "电子邮件信息：hello , word";
    }
}

//增加微信
class WeiXin implements IReceiver {

    @Override
    public String getInfo() {
        return "微信消息：hello , ok";
    }
}

//方式2
class Person {

    //这里我们是对接口的依赖
    public void receive(IReceiver receiver) {

        System.out.println(receiver.getInfo());
    }
}
