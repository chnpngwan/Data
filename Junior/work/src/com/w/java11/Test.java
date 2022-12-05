package com.w.java11;
public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "小米";
        stu.age = 18;
        stu.stuClass = "计网1";
        stu.eat();
        stu.study();
        Teacher t = new Teacher();
        t.name = "鹏哥";
        t.age = 19;
        t.subject = "java程序设计";
        t.eat();
        t.teach();
    }

}
