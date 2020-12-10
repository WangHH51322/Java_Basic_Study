package com.wang.FinalTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/10 14:48
 */
/*
final:最终的

1.final可以用来修饰的结构:类 方法 变量

1.1 final 用来修饰类:这个类不能被其他类所继承
          比如:String类 System类 StringBuffer类
1.2 final 用来修饰方法:表明这个方法不能被重写
          比如:Object中的getClass()方法,获取当前对象所属的类
1.3 final 用来修饰变量:此时的"变量"就称为一个常量
          1.3.1 final修饰属性:可以考虑赋值的位置有:显式初始化 , 代码块中初始化 , 构造器中初始化
          1.3.2 final修饰局部变量,尤其是使用final修饰形参时,表明此形参是一个常量.当我们调用此方法时,给常量形参一个实参,一旦赋值
                以后,就只能在方法体内使用此形参,再也不能重新赋值

1.4 static final ①用来修饰属性:代表全局常量
                 ②用来修饰方法:
 */
public class FinalTest {

    //显式初始化
    final int WIDTH = 10;

    //代码块中初始化
    final int LEFT;
    {
        LEFT = 1;
    }

    //构造器中初始化
    final int RIGHT;
    public FinalTest(){
        RIGHT = 3;
    }

/*
final修饰的属性不能通过"对象.属性"或"对象.方法"的方式,进行赋值
 */
//    final int DOWN;
//    public void setDOWN(int down){
//        this.DOWN = down;
//    }

/*
final修饰的属性不能默认初始化
 */
//    final double length;

/*
下面的方法中的变量无法被更改,即变为了一个常量
 */
//    public void doWIDTH(){
//        with = 20;
//    }

    public static void main(String[] args) {

        FinalTest finalTest = new FinalTest();
        finalTest.show(20);
    }

    public void show(){
        final int NUM = 10;//此时NUM是常量
        /*
        下面的方法中的常量无法被更改
         */
        //NUM ++;
    }

    public void show(final int num){
        System.out.println(num);
        /*
        此时num已经是一个常量,无法再被赋值
         */
        //num = 15;
    }
}



final class FinalA{

}

/*
下面的类都无法继承
 */
//class B extends FinalA{
//
//}

//class C extends String{
//
//}


class A{
    public final void show(){}
}
/*
下面的类的方法都无法被重写
 */
//class AA extends A{
//    public void show(){}
//}
