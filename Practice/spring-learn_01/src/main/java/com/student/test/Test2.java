package com.student.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.car.bean.Car;
import com.car.bean.Employee;
import com.student.bean.Student;

/**
 * @author ChnpngWng
 *
 * @date   Mar 1, 20239:15:44 AM
 */
public class Test2 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)applicationContext.getBean("Student");
		System.out.println(student);
		System.out.println("-----------------");
		Employee employee = (Employee)applicationContext.getBean("employee");
		System.out.println(employee.getName()+";"+employee.getCar());
	}
}
