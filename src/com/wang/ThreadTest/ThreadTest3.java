package com.wang.ThreadTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/4 16:56
 */
class HelloThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
public class ThreadTest3 {

    public static void main(String[] args) {

        HelloThread helloThread = new HelloThread();
        helloThread.setName("HelloThread");
        helloThread.start();

    }

}
