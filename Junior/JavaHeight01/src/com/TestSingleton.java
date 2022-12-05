package com;

public class TestSingleton {
	public static void main(String[] args) {
		Singleton iSingleton1=Singleton.getSingleton();
		Singleton iSingleton2=Singleton.getSingleton();
		Singleton iSingleton3=Singleton.getSingleton();
		System.out.println(iSingleton1);
		System.out.println(iSingleton2);
		System.out.println(iSingleton3);
	}
}
