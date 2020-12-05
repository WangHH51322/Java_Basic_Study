package com.wang.object.toString;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/11/30 15:42
 */
public class Student extends Person {

    private Integer grade;

    public Student(){

    }

    public Student(String name,Integer age,Integer grade){
        super(name, age);
        this.grade = grade;
    }

    public void academic(){
        System.out.println(this.getName() + "正在上" + this.grade + "年级");
    }

    /*对父类中的eat方法进行重写*/
    @Override
    public void eat(String food){
        System.out.println(this.getName() + "不喜欢吃" + food);
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                '}';
    }
}
