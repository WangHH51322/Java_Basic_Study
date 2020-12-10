package com.wang.AbstractTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/10 21:55
 */
public class Student extends Person{

    public Student() {
    }

    public Student(String name, Integer age) {
        super(name, age);
    }

    /*
    Student的父类中有静态方法,所以子类中需要重写此方法
     */
    @Override
    public void walk() {
        System.out.println("学生跑步很快!");
    }

    @Override
    public void eat(String food) {
        System.out.println("学生要多吃" + food);
    }
}
