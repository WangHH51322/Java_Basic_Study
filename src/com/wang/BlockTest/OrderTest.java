package com.wang.BlockTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/10 14:42
 */

/*
对象属性可以赋值的位置:
①默认初始化;
②显示初始化/⑤在代码块中赋值
③构造器中初始化
④有了对象后,可以通过"对象.属性"或"对象.方法"的方式,进行赋值

执行的先后顺序:① - ②/⑤ - ③ - ④
 */
public class OrderTest {

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }

}

class Order{

    {
        orderId = 33;
    }

    int orderId = 22;
}
