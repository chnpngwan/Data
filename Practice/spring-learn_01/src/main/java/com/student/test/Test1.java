package com.student.test;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.bean.User;

/**
 * @author ChnpngWng
 *
 * @date   Mar 1, 202311:21:11 AM
 */
public class Test1 {
	@Test
	void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml"); User
		 user = (User) applicationContext.getBean("user"); System.out.println(user);
		 System.out.println("------------"); User user1 = (User)
		 applicationContext.getBean("user1"); System.out.println(user1);
	}
	
	/*
	 * public static void main(String[] args) { ApplicationContext
	 * applicationContext = new ClassPathXmlApplicationContext("spring.xml"); User
	 * user = (User) applicationContext.getBean("user"); System.out.println(user);
	 * System.out.println("------------"); User user1 = (User)
	 * applicationContext.getBean("user1"); System.out.println(user1); }
	 */
}
