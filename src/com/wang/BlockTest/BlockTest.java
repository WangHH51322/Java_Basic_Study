package com.wang.BlockTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/3 16:39
 */
/*
代码块
    作用:初始化类,对象
    如果有修饰的话,只能使用static
        分类:静态代码块    非静态代码块

        静态代码块:
            >内部可以有输出语句
            >随着类的加载而执行
            >只执行一次(就是类加载的时候)
            >作用:初始化类的时候,对类进行赋值
            >如果一个类中定义了多个静态代码块,按照声明的先后顺序执行;静态代码块优先于非静态代码块的执行
            >静态代码块内只能调用静态的属性/方法,不能调用非静态

        非静态代码块:
            >内部可以有输出语句
            >随着对象的创建而执行
            >每创建一个对象就执行一次非静态代码块
            >作用:可以在创建对象时,对对象的属性进行初始化
            >如果一个类中定义了多个非静态代码块,按照声明的先后顺序执行
            >非静态代码块内既能调用非静态的属性/方法,也能调用静态的属性/方法
 */
public class BlockTest {
    public static void main(String[] args) {

        String say = Person.getSay();
        System.out.println(say);

        Person person1 = new Person();
        System.out.println(person1.getAge());
        Person person2 = new Person();
    }
}
