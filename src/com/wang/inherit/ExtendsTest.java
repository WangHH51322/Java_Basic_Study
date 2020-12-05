package com.wang.inherit;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/11/30 15:45
 */
/*
* 继承方法的测试
* */
public class ExtendsTest {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("小明");
        student.setAge(18);
        student.setGrade(8);

        student.eat("猪肉炖粉条");
        student.academic();
    }
}
