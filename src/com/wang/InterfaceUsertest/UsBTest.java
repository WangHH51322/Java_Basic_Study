package com.wang.InterfaceUsertest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/12 16:48
 */
/*
接口的使用
1. 接口在使用上满足多态性
2. 接口,实际上就是定义了一种规范
3. 开发中,体会面向接口编程
 */
public class UsBTest {

    public static void main(String[] args) {
        Computer computer = new Computer();

        //满足多态性
        Usb usb = new Flash();
        computer.dataTransfer(usb);
    }
}
