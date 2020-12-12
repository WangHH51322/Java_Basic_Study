package com.wang.InterfaceTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/12 15:54
 */
public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞机可以飞!");
    }

    @Override
    public void stop() {
        System.out.println("飞机可以停!");
    }
}
