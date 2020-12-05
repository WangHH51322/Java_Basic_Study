package com.wang.polymorphic;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/1 10:55
 */

/*
* 多态性
* */
public class PolymorphicTest {
    public static void main(String[] args) {

        //对象的多态性:父类的引用指向子类的对象
        Person student = new Student("小强",12,6);
        Person teacher = new Teacher("老李",54,9);

        System.out.println("*************************************");
        //多态的使用:当调用子父类同名同参数的方法时,实际执行的是子类重写父类的方法___虚拟方法调用
        //在编译的时候,只能调用父类中声明的方法,但是在执行的时候,实际执行的是子类重写父类的方法,即:编译看左边,执行看右边
        //但是多态性只适用于方法,不适用于属性(编译和执行都看左边)
        student.eat("臭豆腐");
        teacher.eat("臭鳜鱼");

        System.out.println("****************************************");
        /*
        * 多态的使用:对于show()方法,只需要在Person类中创建,但是Person的子类Student和Teacher都可以调用,不需要再子类中重复创建
        * */
        student.show(student);
        teacher.show(teacher);

        System.out.println("****************************************");
        /*
        * 使用多态以后,内存中加载了子类的所有属性和方法,但由于变量声明为父类,导致编译时,只能使用父类声明的方法和属性,子类特有的属性和方法不能调用
        * */

        //如何调用自雷特有的属性和方法
        //向下转型:使用强制类型转换符
        Student s = (Student) student;
        Teacher t = (Teacher) teacher;

        s.academic();
        t.teach();

        //使用强转时,可能会出现ClassCastException的异常
        //Student s = (Teacher) student;
        //因此引入了 instanceof  关键字
        /*
        * a instanceof A  判断对象a是否是类A的实例,是返回true,否返回false
        * 如果B是A的父类,则a instanceof B 的返回值也是true
        * */

        if (student instanceof Teacher){
            System.out.println("*****teacher******");
            Teacher tt = (Teacher) student;
            tt.teach();
        }else {
            System.out.println("*******转换出错*********");
        }

        if (student instanceof Student){
            System.out.println("*******Student******");
            Student ss = (Student) student;
            ss.academic();
        }else {
            System.out.println("*******转换出错*********");
        }

    }
}
