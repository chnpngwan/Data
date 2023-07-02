package com.car.bean;

/**
 * @author ChnpngWng
 *
 * @date   Mar 1, 20239:45:11 AM
 */
public class Car {
	private String brand;
	private String color;
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + "]";
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
		
}
