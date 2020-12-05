package com.wang.Wrapper;


import org.junit.jupiter.api.Test;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/2 11:12
 */
public class WrapperTest {

    @Test
    public void test1(){

        //自动装箱
        int numb = 15;
        Integer integer = numb;
        System.out.println(integer.toString());     //15

    }
}
