package com.w.java10;
/*
 编写一个Person抽象类，要求含有姓名（name）年龄（age）两个私有属性以
 及吃饭（eat） 和睡觉（sleep）两个抽象方法，并写出带参构造方法，
 创建学生（student）和工人（worker） 两个类，继承Person类，学生类多
 出了私有属性学号和学习方法（输出我爱学习），工 人类多出了私有属性工
 号和工作方法（输出我爱工作），在主函数中创建学生和工人类 的实例对象，
 使用构造方法赋值，并输出所有属性和方法
 */
public abstract class Person {
    private String name;
    private int age;
    public abstract void eat();
    public abstract void sleep();

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}