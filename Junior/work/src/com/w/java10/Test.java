package com.w.java10;
public class Test {
    public static void main(String[] args) {
        Student student = new Student("张三",19,213501);
        System.out.println(student.getName()+","+student.getAge()+","+student.getStuId());
        student.eat();
        student.sleep();
        student.study();
        System.out.println("============================");
        Worker worker = new Worker("李四",18,211003);
        System.out.println(worker.getName()+","+worker.getAge()+","+worker.getWorkerId());
        worker.eat();
        worker.sleep();
        worker.work();

    }

}

