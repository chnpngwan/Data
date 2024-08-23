package com.java;

public class Horse extends Animal{
	@Override
	public void eat() {
		System.out.println("Âí¶ùÒª³Ô²İ£¡");
	}
}
class Sheep extends Animal{
	@Override
	public void eat() {
		System.out.println("ÃàÑòÒª³Ô²İ£¡");
	}
}
class Tigger extends Animal{
	@Override
	public void eat() {
		System.out.println("ÀÏ»¢Òª³ÔÈâ");
	}
}

