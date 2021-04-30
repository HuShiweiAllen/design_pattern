package com.itguigu.prototype.deepclone;

import java.io.Serializable;
import lombok.Data;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-04-29
 **/
@Data
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    //构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {

        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //因为该类的属性都是String，因此我们这里使用默认的clone来完成
    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

}
