package com.itguigu.principle.inversion.inprove;

/**
 * @description:
 * @author: David Allen
 * @date: 2021-03-09
 **/
public class DependencyPass {

    public static void main(String[] args) {

        //方式1测试
       /* ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);*/

        //方式2测试:通过构造器进行依赖传递
        /*ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose(changHong);
        openAndClose.open();*/

        //方式3测试：通过setter方法进行依赖传递
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(new ChangHong());

        openAndClose.open();

    }

}

//方式1： 通过接口传递实现依赖
//开关接口
/*interface IOpenAndClose {

    void open(ITV tv);//抽象方法，接收接口
}

interface ITV {//ITV接口

    void play();
}

//实现接口
class OpenAndClose implements IOpenAndClose {

    @Override
    public void open(ITV tv) {

        tv.play();
    }
}
*/

class ChangHong implements ITV {

    @Override
    public void play() {

        System.out.println("打开长虹电视机！");
    }
}

//方式2：通过构造方法依赖传递
/*interface IOpenAndClose {

    void open();//抽象方法
}

interface ITV {

    void play();
}

class OpenAndClose implements IOpenAndClose {

    public ITV tv;//成员

    //构造方法
    public OpenAndClose(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {

        tv.play();
    }
}*/

//方式3：通过setter方法传递
interface IOpenAndClose {

    void open();

    void setTv(ITV tv);
}

interface ITV {

    void play();
}

class OpenAndClose implements IOpenAndClose {

    public ITV tv;

    @Override
    public void open() {

        tv.play();
    }

    @Override
    public void setTv(ITV tv) {

        this.tv = tv;
    }
}
