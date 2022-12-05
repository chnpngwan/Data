package com.w.java11;
/*
 利用继承，来描述，人，老师，学生之间的关系
1）老师含有属性：name，age，subject，含有方法：eat，teach，toString
2）学生含有属性：name，age，class，含有方法：eat，study，toString
3）利用继承的思想，从老师和学生中抽象出人，并创建Test进行调用并输出
 */
public abstract class Person {//抽象出的父类
    String name;
    int age;
    public abstract void eat();
    public abstract String toString();
}

