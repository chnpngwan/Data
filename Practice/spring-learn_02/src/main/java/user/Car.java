package user;

/**
 * @author ChnpngWng
 *
 * @date   Mar 2, 20236:49:21 PM
 */
public class Car {
	private String brand;
	private String licensePlate;
	/**
	 * @param brand
	 * @param licensePlate
	 */
	public Car(String brand, String licensePlate) {
		super();
		this.brand = brand;
		this.licensePlate = licensePlate;
	}
	/**
	 * 
	 */
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", licensePlate=" + licensePlate + "]";
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the licensePlate
	 */
	public String getLicensePlate() {
		return licensePlate;
	}
	/**
	 * @param licensePlate the licensePlate to set
	 */
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
}
