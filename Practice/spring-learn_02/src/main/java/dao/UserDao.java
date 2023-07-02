package dao;

import pojo.User;

/**
 * @author ChnpngWng
 *
 * @date   Mar 2, 20238:33:31 PM
 */
public class UserDao {
	public User userByID(String userId) {
		User user = new User("132432","李四","35457",19,"云南昆明","8765");
		return user;
	}
	public boolean insert(User user) {
		System.out.println("插入数据："+user.getUserId()+","
				+user.getUserName()+","
				+user.getPassword()+","
				+user.getAge()+","
				+user.getAddress()+","
				+user.getFlag());
		return true;
	}
	public boolean update(User user) {
		System.out.println("修改用户编号："+user.getUserId()+"密码"
				+user.getPassword());
		return true;
	}
	public boolean delete(User user) {
		System.out.println("删除用户编号："+user.getUserId()+"的数据");
		return true;
	}
}
