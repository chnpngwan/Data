package com.w.考试;

/**
 * ClassName:Student
 * PackageName:com.w.考试
 * Description:
 *
 * @date:2022/5/9 10:55
 * @author: Yuancoding
 */
public class Student {
    private String name;
    private String studentID;
    private int age;

    public void student(){

    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, String studentID, int age) {
        this.name = name;
        this.studentID = studentID;
        this.age = age;
    }
}
