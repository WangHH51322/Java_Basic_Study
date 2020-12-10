package com.wang.AbstractTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/10 21:51
 */
/*
abstract关键字的使用

1.abstract可以用来修饰的结构:类 方法

    1.1 abstract修饰类:抽象类
        >此类不能实例化
        >抽象类中一定要有构造器,便于子类对象实例化的时候调用(子类对象实例化的全过程)
        >开发中,都会提供抽象类的子类,让子类对象实例化,完成相关操作

    1.2 abstract修饰方法:抽象方法
        >抽象方法只有方法的声明,没有方法体
        >包含抽象方法的类,一定是抽象类;反之,抽象类中是可以没有抽象方法的
        >若子类重写了父类中的所有抽象方法后,此子类方可实例化;
         若子类没有重写父类里所有的抽象方法,此子类也是一个抽象类

2.使用上的注意点:
    2.1 abstract不能用来修饰:属性 构造器等结构
    2.2 abstract不能用来修饰:私有方法 静态方法 final方法 final的类
 */
public class AbstractTest {
    public static void main(String[] args) {

        //一旦Person类抽象了,就不可实例化
//        Person person = new Person();
//        person.eat("猪肉");

        Student student = new Student();
        student.walk();
        student.eat("鸡蛋");

        AbstractTest abstractTest = new AbstractTest();
        abstractTest.method(new Student()); //匿名对象

        Teacher teacher = new Teacher();
        abstractTest.method2(teacher);  //非匿名的类,非匿名的对象

        abstractTest.method2(new Teacher());    //非匿名的类,匿名的对象

        System.out.println("*************************************");
        /*
        创建一个匿名子类的对象 p
         */
        Person p = new Person() {
            @Override
            public void walk() {
                System.out.println("好好走路");
            }

            @Override
            public void eat(String food) {
                super.eat(food);
            }
        };

        System.out.println("***********************************");
        /*
        创建一个匿名子类的匿名对象 p
         */
        abstractTest.method(new Person() {
            @Override
            public void walk() {
                System.out.println("好好走路");
            }
        });

    }

    public void method(Person p){
        System.out.println(p.getName());
    }

    public void method2(Teacher t){
        System.out.println(t.getName());
    }
}
