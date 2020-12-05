package com.wang.ThreadTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/4 10:59
 */
public class ThreadTest2 {

    public static void main(String[] args) {

        //创建Thread类的匿名子类的方式
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        };

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }

            }
        };
    }
}
