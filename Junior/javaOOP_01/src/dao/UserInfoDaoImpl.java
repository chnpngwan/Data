package dao;

import java.util.Arrays;

import dto.UserInfo;

public class UserInfoDaoImpl implements UserInfoDao{
	//�������飬���ڴ洢�û���Ϣ
	static UserInfo[] uInfo = new UserInfo[6];
	@Override
	public void deleteUser(UserInfo user) {
		
	}

	@Override
	public void updateUser(UserInfo user) {
		
	}

	@Override
	public void saveUser(UserInfo user) {
		for(int i=0;i<uInfo.length;i++) {
			if(uInfo[i]==null) {
				uInfo[0] = user;
				break;
			}
		}
		System.out.println(Arrays.toString(uInfo));
	}

}
