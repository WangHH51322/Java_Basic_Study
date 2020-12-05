package com.wang.BlockTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/3 16:37
 */
public class Person {

    private Integer age;
    private String name;
    private static String say = "Hello World!";

    public void eat(){
        System.out.println(this.name + "喜欢吃酸菜鱼");
    }

    public void show(){
        System.out.println("我叫" + this.name + ",我今年" + this.age);
    }

    public Person() {
    }

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    //static的代码块
    static{
        System.out.println("hello static block");
        say = "Hello New World!!!";
    }
    //非static的代码块
    {
        age = 10;
        System.out.println("hello NoStatic block");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getSay() {
        return say;
    }

    public static void setSay(String say) {
        Person.say = say;
    }
}
