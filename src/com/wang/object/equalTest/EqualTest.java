package com.wang.object.equalTest;

import java.util.Date;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/2 9:10
 */
public class EqualTest {

    /*
    *  == :运算符的使用
    *   1.可以使用在比较基本数据类型变量和引用数据类型变量中;
    *   2.如果比较的是基本数据类型变量,比较两个变量保存的值是否相等(类型不一定相等)
    *     ........是引用数据类型,比较两个对象的地址值是否相同
    *
    *  equals()方法的使用:
    *   1.只适用于引用数据类型
    *       ①Object类中equals()的定义:
    *           public boolean equals(Object obj) {
                    return (this == obj);
                }
    *       相当于 == ,比较两个对象的地址值是否相同
    *
    *       ②像String Date  File 包装类 重写了Object类中的euqals()方法,重写后比较的不是地址值,而是对象的"实体内容"是否相同
    *
    *       ③自定义的类如果使用equals(),一般不是使用 == ,通常比较"实体内容",需要对Object类中的equals()方法进行重写
    *
    * */
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 10;
        double b1 = 10.0;
        boolean b2 = true;
        char c = 10;
        System.out.println(i1 == i2);   //true
        System.out.println(i1 == b1);   //true
//        System.out.println(i1 == b2);     不可比较
        System.out.println(i1 == c);    //true  因为char类型是按整型存放的,存放的是它的ASCII码值;10的ASCII码就是10

        System.out.println("********************************");

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);   //true  因为A的ASCII码就是65

        Student s1 = new Student("小明",10,3);
        Student s2 = new Student("小明",10,3);
        System.out.println(s1 == s2);   //false     二者的地址值不同

        String str1 = new String("小明");
        String str2 = new String("小明");
        System.out.println(str1 == str2);   //false     二者的地址值不同

        System.out.println("**********************");
        System.out.println(s1.equals(s2));  //false     实体类调用的是父类Object的equals()方法
        System.out.println(str1.equals(str2));  //true

        Date date1 = new Date(3243252323L);
        Date date2 = new Date(3243252323L);
        System.out.println(date1.equals(date2));    //true

        System.out.println("*********************");
        Teacher t1 = new Teacher("老李",55,9);
        Teacher t2 = new Teacher("老李",55,9);
        System.out.println(t1.equals(t2));

    }
}
