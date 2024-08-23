package javaOOP_01_03_14;

import java.util.Scanner;

public class Barracks {
	private static int count;
	private String name;
	private int selfCount;
	private static Barracks[] bkArray = new Barracks[3];
	private static Scanner sc = new Scanner(System.in);
	private static int index = 0;
	private boolean target;
	
	//设置姓名
	public void setName(String name) {
		if(name.length()>8 || name.length()<4) {
			target = false;
			System.out.println("名字不符合要求！");
			System.out.println("请重新输入名字：");
			this.setName(sc.next());
		}else {
			target = true;
			this.name = name;
		}
	}
	public int getSelfCount() {
		return selfCount;
	}
	
	public void operator() {
		System.out.println("请输入第"+(index+1)+"个士兵的名字：");
		this.setName(sc.next());
		if(target) {
			System.out.println("请输入第"+(index+1)+"个兵营的创建士兵总数：");
			this.setSelfCount(sc.nextInt());
		}
	}
	public void setSelfCount(int count) {
		this.selfCount = count;
	}
	

}
