package com.wang.singleton;

import org.w3c.dom.ls.LSOutput;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/3 16:04
 */
/*
* 单例模式:
*   饿汉式:
*       坏处:对象加载时间长
*       好处:线程安全
*   懒汉式:
*       好处:延迟对象的加载
*       坏处:目前的写法不安全
* */
public class SingeltonTest {
    public static void main(String[] args) {

        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);

        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1 == order2);
    }
}

//懒汉式
class Bank{

    //1.私有化类的构造器
    private Bank(){}

    //2.声明当前类对象并初始化,声明必须为static
    private static Bank instance = new Bank();

    //3.声明public  static的返回当前类对象的方法
    public static Bank getInstance(){
        return instance;
    }
}

//饿汉式
class Order{

    //1.私有化类的构造器
    private Order(){}

    //2.声明当前类对象没有初始化,声明必须为static
    private static Order instance = null;

    //3.声明public  static的返回当前类对象的方法
    public static Order getInstance(){
        if (instance == null){
            return instance = new Order();
        }
        return instance;
    }
}
