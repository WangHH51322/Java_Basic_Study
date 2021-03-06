package com.wang.ssuper;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/11/30 15:37
 */
public class Person {

    private String name;
    private Integer age;
    private Integer id;//身份证号

    public Person(){

    }

    public Person(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public void eat(String food){
        System.out.println(this.name + "喜欢吃" + food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
