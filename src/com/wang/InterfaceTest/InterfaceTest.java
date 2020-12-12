package com.wang.InterfaceTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/12 15:40
 */
/*
接口的使用:
1. 接口使用interface来定义
2. 在Java中,接口和类是并列的两个结构
3. 如何定义接口,定义接口中的成员

    3.1 JDK7及以前,只能定义全局常量和抽象方法
        >全局常量:public static final (书写时,可以省略不写)
        >抽象方法:public abstract

    3.2 JDK8 额外定义了静态方法 默认方法
        >

4. 接口中不能定义构造器,因此接口不可以实例化
5. Java开发中,接口都通过 让类去实现(implements) 的方式来使用
   如果实现类覆盖了接口中的所有抽象方法,则次实现类就可以实例化
   如果没有,则实现类仍为一个抽象类

6. Java类可以实现多接口 --->弥补了Java单继承性的局限性
   格式:class AA extends BB implements CC,DD,EE

7. 接口与接口之间可以继承,而且可以多继承

***********************************************************

8. 接口的具体使用,体现多态性
9. 接口,实际上可以看作是一种规范

 */
public class InterfaceTest {

    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fly();
        plane.stop();

        Bullet bullet = new Bullet();
        bullet.attack();
        bullet.shoot();
    }
}
