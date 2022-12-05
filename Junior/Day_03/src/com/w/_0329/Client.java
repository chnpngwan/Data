package com.w._0329;

import java.util.Scanner;

public class Client {	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Çëµã²Í£º");
		String type=scanner.next();
		FoodFactory.createFoods(type);
	}
}
