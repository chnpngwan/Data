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
	
	//��������
	public void setName(String name) {
		if(name.length()>8 || name.length()<4) {
			target = false;
			System.out.println("���ֲ�����Ҫ��");
			System.out.println("�������������֣�");
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
		System.out.println("�������"+(index+1)+"��ʿ�������֣�");
		this.setName(sc.next());
		if(target) {
			System.out.println("�������"+(index+1)+"����Ӫ�Ĵ���ʿ��������");
			this.setSelfCount(sc.nextInt());
		}
	}
	public void setSelfCount(int count) {
		this.selfCount = count;
	}
	

}
