package com.wang.ssuper;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/11/30 22:13
 */
/*
* super方法的测试
*   1 在子类中使用  "super.属性"  或  "super.方法"  的方式,显示的调用父类中的声明或方法,一般省略
*     子类/父类定义了同名属性时,想要在子类中使用父类的属性,必须使用 "super.属性"  的方法
*     子类/父类定义了同名方法时,想要在子类中使用父类的属性,必须使用 "super.方法"  的方法
*
*   2 super调用构造器:
*     在子类的构造器中显示的使用"super(形参列表)"的方式,调用父类中声明的指定的构造器
*     "super(形参列表)"的使用,必须声明在子类构造器的首行
*     在类的构造其中,"super(形参列表)"和"this(形参列表)"只能二选一,不能同时出现
*     在子类构造器的首行,没有显式的声明"super(形参列表)"或"this(形参列表)",则默认调用的是父类中空参的构造器:super()
*
* */
public class SuperTest {
    public static void main(String[] args) {
        Student student = new Student("小王",21,5);
//        student.setName("小王");
//        student.setAge(21);
        student.show();
    }
}
