package javaOOP_01_03_08;

import java.util.Scanner;

public class Barracks {
	int count;
	String name;
	int selfCount;
	
	public void operator() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("�������һ����");
			String name = sc.next();
			this.name = name;
		}
	}

}
