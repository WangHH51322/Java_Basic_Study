package com.wang.InterfaceUsertest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/12 16:50
 */
public class Flash implements Usb{
    @Override
    public void start() {
        System.out.println("Flash开始传输文件!");
    }

    @Override
    public void end() {
        System.out.println("Flash结束文件传输!");
    }
}
