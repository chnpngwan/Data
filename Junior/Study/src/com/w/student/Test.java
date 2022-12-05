package com.w.student;

public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.setName("张三");
        teacher.setAge(34);
        System.out.println(teacher.getName()+","+teacher.getAge());
        teacher.teach();

        Teacher teacher1= new Teacher("李四",33);
        System.out.println(teacher1.getName()+","+teacher1.getAge());
    }
}
