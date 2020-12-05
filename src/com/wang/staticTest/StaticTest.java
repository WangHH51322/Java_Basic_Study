package com.wang.staticTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/3 14:46
 */

/*
* static可用来修饰属性、方法、代码块、内部类
*   1   static修饰的属性为"静态属性",否则为"非静态属性"(实例变量)
*   2   修改一个对象的"实例变量"时,不会修改其他对象的实例变量        修改一个对象的"静态变量"时,同一类的其他对象的静态变量也改变(同一类的不同对象共用一个静态变量)
*   3   静态变量随着类的加载而加载;  静态变量的加载遭早于对象的创建
*               静态变量     实例变量
*           类   yes         no
*           对象  yes        yes
*
*   4   static修饰的方法为"静态方法",否则为"非静态方法"
*               静态方法     非静态方法
*           类   yes         no
*           对象  yes        yes
*   5   静态方法只能调用静态的方法或属性;   非静态方法既能调用静态的方法或属性,也可调用非静态的方法或属性
*       在静态的方法内,不能使用this关键字 super关键字
*   6   >   当属性是可以被多个对象共享,不随着对象变化时,可以将其定义为static
*           常量一般也定义为static
*       >   操作静态属性的方法,通常设置为static
*           工具类中的方法,习惯上声明为static.比如 Math Array Collections
*
*
*
* */
public class StaticTest {

    public static void main(String[] args) {
        Chinese.setNation("中国");    //静态属性,通过类直接调用
        Chinese.show();

        Chinese c1 = new Chinese();
        c1.setName("小明");
        c1.setAge(25);
        c1.eat();

        Chinese c2 = new Chinese();
        c2.setName("小李");
        c2.setAge(17);

        System.out.println(c1);
        System.out.println(c2);
    }
}
