package com.w.java11;
//学生含有属性：name，age，class，含有方法：eat，study，toString
public class Student extends Person{
    String stuClass;
    @Override
    public void eat() {
        System.out.println("学生吃食堂或者外卖");
    }

    @Override
    public String toString() {
        return name+","+age;
    }
    public void study() {
        String msg = toString();
        System.out.println(stuClass+"班的"+msg+",是一个爱学习的好学生！");

    }

}

