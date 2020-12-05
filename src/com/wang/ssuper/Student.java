package com.wang.ssuper;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/11/30 15:42
 */
public class Student extends Person {

    private Integer grade;
    private Integer id;//学号

    public Student(){}

    public Student(Integer grade){
        this.grade = grade;
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

    public void show(){
        System.out.println("年龄:" + this.getAge() + ",姓名:" + this.getName());
        eat("food");    //调用这个子类中的eat方法
        super.eat("food");  //调用父类中的eat方法
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

}
