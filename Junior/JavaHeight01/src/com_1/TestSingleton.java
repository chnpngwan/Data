package com_1;

public class TestSingleton {
	public static void main(String[] args) {
		Singleton singleton=Singleton.getSingleton();
		Singleton singleton1=Singleton.getSingleton();
		Singleton singleton2=Singleton.getSingleton();
		System.out.println(singleton);
		System.out.println(singleton1);
		System.out.println(singleton2);
	}
}
