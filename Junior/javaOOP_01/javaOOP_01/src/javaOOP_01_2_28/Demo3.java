package javaOOP_01_2_28;

import java.util.Scanner;

//2、输入账号、密码，模拟登录过程。
public class Demo3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入账号：");
		String num = sc.next();
		System.out.println("请输入密码：");
		String password = sc.next();
		//比较账号、密码
		if(num.equals("admin")) {
			//账号存在、接着比较密码
			if(password.equals("1234")) {
				System.out.println("登录成功！");
			}else {
				System.out.println("密码错误！");
			}
		}else {
			System.out.println("账号不存在！");
		}
	}

}
