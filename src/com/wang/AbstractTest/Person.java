package com.wang.AbstractTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/10 21:53
 */
public abstract class Person extends Creature{

    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    /*
    Person的父类中有静态方法,所以子类中需要重写此方法
     */
    public void eat(String food){
        System.out.println("人吃饭" + food);
    }

    //抽象方法
    public abstract void walk();

//    public void walk(){
//        System.out.println("人走路");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
