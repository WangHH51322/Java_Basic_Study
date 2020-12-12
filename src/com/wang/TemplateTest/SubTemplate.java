package com.wang.TemplateTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/12 11:16
 */
public class SubTemplate extends Template{

    @Override
    public void code() {
        for (int i = 2; i < 1000; i++) {
            boolean isFlag = true;
            for (int j = i; j < Math.sqrt(i); j++) {
                if (i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
        }
    }

}
