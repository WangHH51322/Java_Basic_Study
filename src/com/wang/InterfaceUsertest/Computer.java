package com.wang.InterfaceUsertest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/12 16:51
 */
public class Computer {

    public void dataTransfer(Usb usb){
        usb.start();
        usb.end();
    }
}
