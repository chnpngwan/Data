package com.w.java11;
//老师含有属性：name，age，subject，含有方法：eat，teach，toString
public class Teacher extends Person{
    String subject;
    @Override
    public void eat() {
        System.out.println("老师也要吃饭！");
    }

    @Override
    public String toString() {
        return name+","+age;
    }
    public void teach() {
        String msg = toString();
        System.out.println(msg+",这个老师教的是"+subject);
    }
}

