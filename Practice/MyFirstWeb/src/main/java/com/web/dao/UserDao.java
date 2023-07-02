package com.web.dao;

import com.web.pojo.User;

/**
 * @author ChnpngWng
 * @date 2022-10-13 下午7:09:49
 */
//针对用户进行增删改查的操作
public class UserDao {
	//登录方法
	public User login(String account,String password){
		//模拟数据验证
		if(account.equals("admin") && password.equals("123456")){
			User adminUser = new User();
			adminUser.setAccount(account);
			adminUser.setPassword(password);
			adminUser.setType(1);//管理员
			return adminUser;
		} else if (account.equals("zhang") && password.equals("123456")) {
			User user = new User();
			user.setAccount(account);
			user.setPassword(password);
			user.setType(0);//普通用户
			return user;
		}
		return null;//返回空代表账号密码不对
	}
}
