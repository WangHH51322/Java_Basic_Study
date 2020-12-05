package com.wang.object.equalTest;

import java.util.Objects;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/1 10:58
 */
public class Teacher extends Person {

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

    //重写的原则:比较两个实体类里面的实体内容是否相同
    //自动实现equals()的重写
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(grade, teacher.grade);
    }

    //手动实现equals()的重写
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof Teacher){
//            Teacher teacher = (Teacher) obj;
//            return this.getName().equals(teacher.getName()) && this.getAge() == teacher.getAge() && this.grade == teacher.grade;
//        }
//        return false;
//    }
}
