package javaOOP_01_03_21;

public class Car extends Vehicles{
	int seats;//子类中新增的属性
    //书写构造方法
	public Car(String brand, String color) {
		super(brand, color);
	}
	public void showCar() {
		System.out.println("展示小轿车的信息！");
	}
	

}
