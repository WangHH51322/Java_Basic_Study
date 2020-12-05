package com.wang.staticTest;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/12/3 14:48
 */
public class Chinese {

    private String name;
    private Integer age;
    private static String nation;

    public void eat(){
        System.out.println(this.name + "爱吃番茄炒蛋");
    }

    //静态方法只能调用静态方法或属性,不可调用非静态结构
    public static void show(){
        System.out.println("我是中国人!");
        System.out.println(Chinese.nation);
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Chinese.nation = nation;
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
}
