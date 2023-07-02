package com.web.pojo;

/**
 * @author ChnpngWng
 * @date 2022-10-13 下午6:52:43
 */
//描述用户信息的实体类
public class User {
	private String account;//账号
	private String password;//密码
	private int type;//类型  0为普通用户   1为管理员
	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}
	
	
}
