package javaOOP_01_2_28;

import java.util.Scanner;

//1、输入年份，然后判断年分是闰年还是平年？
public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		if((year%4==0 && year%100!=0)||(year%400==0)) {
			System.out.printf("%d年是闰年！",year);
		}else {
			System.out.printf("%d年是平年！",year);
		}
	}

}
