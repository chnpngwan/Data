package javaOOP_01_03_29;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Çëµã²Í£º");
		String type = sc.next();
		FoodFactory.createFoods(type);
	}

}
