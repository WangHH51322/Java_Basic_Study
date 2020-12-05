package com.wang.override;

import com.wang.override.Student;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/11/30 15:45
 */

/*
* 重写的规定:
*   方法的声明:权限修饰符  返回值类型  方法名(形参列表) throws 异常类型{
*                   //方法体
*               }
*   ①子类重写的方法的方法名和形参列表与父类的方法的方法名和形参列表相同
*   ②子类重写的方法的权限修饰符不小于父类中被重写的方法的权限修饰符
*       >特殊情况:子类不能重写父类中的private方法
*   ③返回值类型:
*       >父类中被重写的返回值类型是void,子类中也只能是void
*       >父类................是A类型,子类中返回值类型可以A类型或A类型的子类
*   ④子类重写的方法的抛出的异常类型不大于父类中被重写的方法抛出的异常类型
*   Attention:如果父类中的方法是static(静态方法),则子类中同名同参的方法也声明为static(此时不叫重写,因为静态方法无法被重写)
*     如果父类中的方法是非static,则子类中同名同参的方法也声明为非static(此时叫重写)
* */
public class OverrideTest {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("小明");
        student.setAge(18);
        student.setGrade(8);

        student.eat("猪肉炖粉条");
        student.academic();
    }
}
