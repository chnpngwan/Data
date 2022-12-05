package dao;

import dto.UserInfo;

public interface UserInfoDao {
	public void deleteUser(UserInfo user);
	public void updateUser(UserInfo user);
	public void saveUser(UserInfo user);

}
