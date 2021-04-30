package com.itguigu.prototype.deepclone;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-29
 **/
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        //方式1完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.clone();

        System.out.println(
            "p.name=" + p.name + "p.deepCloneableTarget=" +p.deepCloneableTarget+"p.deepCloneableTarget.hashCode="+ p.deepCloneableTarget.hashCode());
        System.out.println(
            "p2.name=" + p2.name + "p2.deepCloneableTarget=" +p2.deepCloneableTarget+ "p.deepCloneableTarget.hashCode="+p2.deepCloneableTarget.hashCode());

        //方式2完成深拷贝
        DeepProtoType p3 = (DeepProtoType) p.deepClone();
        System.out.println(
            "p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget+"p.deepCloneableTarget.hashCode="+p2.deepCloneableTarget.hashCode());
        System.out.println(
            "p3.name=" + p3.name + "p3.deepCloneableTarget=" +  p3.deepCloneableTarget+"p3.deepCloneableTarget.hashCode="+p3.deepCloneableTarget.hashCode());

    }

}
