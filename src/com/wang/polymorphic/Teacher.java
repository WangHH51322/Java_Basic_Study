package com.wang.polymorphic;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/1 10:58
 */
public class Teacher extends Person{

    private Integer grade;

    public Teacher(){}

    public Teacher(String name,Integer age,Integer grade){
        super(name, age);
        this.grade = grade;
    }

    public void teach(){
        System.out.println(this.getName() + "正在教" + this.grade + "年级语文");
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
