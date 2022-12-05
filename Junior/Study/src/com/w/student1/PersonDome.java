package com.w.student1;

public class PersonDome {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.setName("李四");
        teacher.setAge(24);
        System.out.println(teacher.getName()+","+teacher.getAge());
        teacher.teach();

        Teacher teacher1=new Teacher("王五",33);
        System.out.println(teacher1.getName()+","+teacher1.getAge());
        teacher1.teach();

        Student student=new Student();
        student.setName("王五");
        student.setAge(13);
        System.out.println(student.getName()+","+student.getAge());
        student.study();

        Student student1=new Student("李四",23);
        System.out.println(student1.getName()+","+student1.getAge());
        student1.study();
    }
}
