package user;

/**
 * @author ChnpngWng
 *
 * @date   Mar 2, 20236:48:04 PM
 */
public class User {
	private String uaserName;
	private String password;
	private Car car;
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param uaserName
	 * @param password
	 * @param car
	 */
	public User(String uaserName, String password, Car car) {
		super();
		this.uaserName = uaserName;
		this.password = password;
		this.car = car;
	}public User(String uaserName, String password) {
		super();
		this.uaserName = uaserName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [uaserName=" + uaserName + ", password=" + password + ", car=" + car + "]";
	}
	/**
	 * @return the uaserName
	 */
	public String getUaserName() {
		return uaserName;
	}
	/**
	 * @param uaserName the uaserName to set
	 */
	public void setUaserName(String uaserName) {
		this.uaserName = uaserName;
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
	 * @return the car
	 */
	public Car getCar() {
		return car;
	}
	/**
	 * @param car the car to set
	 */
	public void setCar(Car car) {
		this.car = car;
	}
	
}
