package com.wang.object.toString;

import com.wang.object.toString.Student;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/2 9:55
 */
/*
* Object中toString()方法的使用:
*
*   public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
*
*   像String Date  File 包装类 重写了Object类中的euqals()方法,返回了"实体内容"
*   自定义类也可以重写toString方法,返回"实体内容
*
* */
public class ToStringTest {

    public static void main(String[] args) {
        Student s1 = new Student("小明",10,3);
        System.out.println(s1.toString());
    }
}
