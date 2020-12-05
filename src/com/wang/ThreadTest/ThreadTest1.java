package com.wang.ThreadTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/4 9:07
 */
/*
* 创建线程方式一:继承Thread类,重写run()方法,调用start开启线程
* 总结:
*   注意:线程开启不一定立即执行,是由CPU调用
*   执行run()方法时,是先后执行,谁在前谁先执行
*   执行start()方法时,是交替执行,输出的结果中两个方法的结果交替出现
* */
public class ThreadTest1 extends Thread{

    @Override
    public void run(){
        //run方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        //main线程,主线程

        //创建一个线程对象
        ThreadTest1 test1 = new ThreadTest1();

        //调用start()方法:启动当前线程; Java虚拟机调用此线程的run方法。
        //不可以让已经start()的线程去执行
        test1.start();
        //test1.run();

        //我们需要重新创建一个线程的对象
        ThreadTest1 test2 = new ThreadTest1();
        test2.start();

        //如下操作仍然是在main线程中执行
        for (int i = 0; i < 2000; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
