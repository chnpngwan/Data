package com.java;

public class Horse extends Animal{
	@Override
	public void eat() {
		System.out.println("���Ҫ�Բݣ�");
	}
}
class Sheep extends Animal{
	@Override
	public void eat() {
		System.out.println("����Ҫ�Բݣ�");
	}
}
class Tigger extends Animal{
	@Override
	public void eat() {
		System.out.println("�ϻ�Ҫ����");
	}
}

