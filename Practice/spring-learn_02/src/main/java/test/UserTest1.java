package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.User;
import service.UserService;

/**
 * @author ChnpngWng
 *
 * @date   Mar 2, 20238:47:31 PM
 */
public class UserTest1 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) applicationContext.getBean("UserService");
		User user = userService.userByID("132432");
		System.out.println(user);
		User user1 = new User("5876357252","李四","35457",19,"云南昆明","8765");
		boolean flag1 = userService.insert(user1);
		if (flag1) {
			System.out.println("插入成功");
		}
		user1.setPassword("7688847668");
		boolean flag2 = userService.update(user1);
		if (flag2) {
			System.out.println("修改成功");
		}
		boolean flag3 = userService.delete(user1);
		if (flag3) {
			System.out.println("删除成功");
		}
	}
}
