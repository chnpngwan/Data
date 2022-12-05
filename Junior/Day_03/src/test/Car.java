package test;

/**
 * @author Dream
 *
 */
public abstract class Car {
	private String brand;
	public abstract void run();
	public Car(String brand) {
		super();
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	
	
}

