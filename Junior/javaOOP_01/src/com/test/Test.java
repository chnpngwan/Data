package com.test;

import com.java.Student;
/*
 * protected修饰的内容不能跨包访问
 * 缺省访问修饰符也不能跨包访问
 * private 修饰的内容在其他地方不能访问。
 */
public class Test {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "张三三";
//		stu.age = 19;
//		System.out.println(stu.name+","+stu.age);
	}

}
