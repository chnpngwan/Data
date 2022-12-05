package javaOOP_01_03_21;
//父类
public class Vehicles {
	String brand;
	String color;
	
	public Vehicles(String brand,String color) {
		this.brand = brand;
		this.color = color;
	}
	
	public void run() {
		System.out.println("汽车可以行驶！");
	}
	public void showInfo() {
		System.out.println("展示汽车信息！");
	}

}
