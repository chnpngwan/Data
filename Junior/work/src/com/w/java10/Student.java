package com.w.java10;
//私有属性学号和学习方法（输出我爱学习）
public class Student extends Person{
    private int stuId;
    public void study() {
        System.out.println("我爱学习");
    }
    public Student(String name, int age,int stuId) {
        super(name, age);
        this.setStuId(stuId);
    }

    @Override
    public void eat() {
        System.out.println("学生吃食堂");
    }

    @Override
    public void sleep() {
        System.out.println("每天睡10小时");
    }
    public int getStuId() {
        return stuId;
    }
    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

}
