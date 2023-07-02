package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import user.User;

/**
 * @author ChnpngWng
 *
 * @date   Mar 2, 20236:58:47 PM
 */
public class UserTest {

	@Test
	public void test1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) applicationContext.getBean("user");
		System.out.println(user);
	}
	
	@Test
	public void test2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) applicationContext.getBean("user1");
		System.out.println(user);
	}
	@Test
	public void test3() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) applicationContext.getBean("user2");
		System.out.println(user);
	}
}
