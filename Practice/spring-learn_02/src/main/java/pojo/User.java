package pojo;

/**
 * @author ChnpngWng
 *
 * @date   Mar 2, 20238:31:45 PM
 */
public class User {
	private String userId;
	private String userName;
	private String password;
	private int age;
	private String address;
	private String flag;
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param userId
	 * @param userName
	 * @param password
	 * @param age
	 * @param address
	 * @param flag
	 */
	public User(String userId, String userName, String password, int age, String address, String flag) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.address = address;
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", age=" + age
				+ ", address=" + address + ", flag=" + flag + "]";
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}
