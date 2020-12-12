package com.wang.InterfaceTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/12 15:58
 */
public class Bullet extends Weapon implements Flyable,Attackable{
    @Override
    public void attack() {
        System.out.println("子弹具有攻击性");
    }

    @Override
    public void fly() {
        System.out.println("子弹可以飞!");
    }

    @Override
    public void stop() {
        System.out.println("子弹遇到物体会停!");
    }
}
