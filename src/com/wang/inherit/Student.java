package com.wang.inherit;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/11/30 15:42
 */
public class Student extends Person{

    private Integer grade;

    public Student(){

    }

    public Student(Integer grade){
        this.grade = grade;
    }

    public void academic(){
        System.out.println(this.getName() + "正在上" + this.grade + "年级");
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
