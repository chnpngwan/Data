package com.java;

public class Feeder {
	public void feed(Animal animal) {
		animal.eat();
	}
	public static void main(String[] args) {
		Animal h = new Horse();
		h.eat();
	}

}
