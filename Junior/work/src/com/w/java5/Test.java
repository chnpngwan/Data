package com.w.java5;

public class Test {
    public static void main(String[] args) {
        Student student=new Student("张三丰","太极班",19,"男");
        student.ACode();
        System.out.println(student.getName());
        System.out.println(student.getStuClass());
        System.out.println(student.getAge());
        System.out.println(student.getSex());

        System.out.println("-----------");
        student.setName("张三");
        student.setStuClass("辅助班");
        student.setAge(12);
        student.setSex("男");
        student.ACode();
        System.out.println(student.getName());
        System.out.println(student.getStuClass());
        System.out.println(student.getAge());
        System.out.println(student.getSex());

    }
}
