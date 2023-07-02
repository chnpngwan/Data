package com.student.bean;

/**
 * @author ChnpngWng
 *
 * @date   Mar 1, 202310:54:16 AM
 */
//工厂
public class UserFactory {
	//静态
	public static User getInstance() {
		System.out.println("到此一游");
		return new User();
	}
	
	//动态
	public User getUser() {
		System.out.println("动态");
		return new User();
	}
}
