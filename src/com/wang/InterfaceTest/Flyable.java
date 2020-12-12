package com.wang.InterfaceTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/12 15:41
 */
public interface Flyable {

    //全局常量:public static final
    public static final int Max_Speed = 7900;
    int Min_Speed = 1;    //省略了 public static final

    //抽象方法
    public abstract void fly();
    void stop();    //省略了 public abstract


}
