package com.wang.TemplateTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/12 11:13
 */
public abstract class Template {

    //计算一个程序的运行时间
    public void spendTime(){

        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();

        System.out.println("程序的执行时间为:" + (end - start) + "ms");
    }

    public abstract void code();
}
