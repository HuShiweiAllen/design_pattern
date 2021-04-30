package com.itguigu.prototype.improve;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-29
 **/
public class Client {

    public static void main(String[] args) {

        Sheep sheep = new Sheep("tom", 2, "卡其色1");
        sheep.friend = new Sheep("jack", 3, "黑色2");

        Sheep sheep2 = (Sheep) sheep.clone();//克隆
        Sheep sheep3 = (Sheep) sheep.clone();//克隆
        Sheep sheep4 = (Sheep) sheep.clone();//克隆
        Sheep sheep5 = (Sheep) sheep.clone();//克隆

        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" +sheep2.friend+""+sheep2.friend.hashCode());
        System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" +sheep3.friend+""+ sheep3.friend.hashCode());
        System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" +sheep4.friend+""+ sheep4.friend.hashCode());
        System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" +sheep5.friend+""+ sheep5.friend.hashCode());

        System.out.println(sheep.friend == sheep2.friend);
        System.out.println(sheep.friend == sheep3.friend);
        System.out.println(sheep.friend == sheep4.friend);
        System.out.println(sheep.friend == sheep5.friend);
    }

}
