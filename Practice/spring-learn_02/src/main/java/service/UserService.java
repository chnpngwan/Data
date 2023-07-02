package service;

import dao.UserDao;
import pojo.User;

/**
 * @author ChnpngWng
 *
 * @date   Mar 2, 20238:40:53 PM
 */
public class UserService {
	private UserDao userDao;
	public User userByID(String userId) {
		User user= userDao.userByID(userId);
		return user;
	}
	public boolean insert(User user) {
		System.out.println("开始事务");
		userDao.insert(user);
		System.out.println("提交事物");
		System.out.println("关闭事物");
		return true;
	}
	public boolean update(User user) {
		System.out.println("开始事务");
		userDao.update(user);
		System.out.println("提交事物");
		System.out.println("关闭事物");
		return true;
	}
	public boolean delete(User user) {
		System.out.println("开始事务");
		userDao.delete(user);
		System.out.println("提交事物");
		System.out.println("关闭事物");
		return true;
	}
	/**
	 * @return the userDao
	 */
	public UserDao getUserDao() {
		return userDao;
	}
	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
