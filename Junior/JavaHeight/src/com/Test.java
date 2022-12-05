package com;

public class Test {
	public static void main(String[] args) {
		SingIeton singIeton1=SingIeton.getsingIeton();
		SingIeton singIeton2=SingIeton.getsingIeton();
		SingIeton singIeton3=SingIeton.getsingIeton();
		System.out.println(singIeton1);
		System.out.println(singIeton2);
		System.out.println(singIeton3);
	}
}
