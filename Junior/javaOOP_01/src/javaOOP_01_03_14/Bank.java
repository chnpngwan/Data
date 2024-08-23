package javaOOP_01_03_14;
//注意：静态的属性访问方式：
//     1、类名.属性
//     2、对象名.属性
public class Bank {
	private static int count = 50000;
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
//			Bank bank = new Bank();
//			bank.count -= 1000;
//			System.out.println("取款成功，账户余额为："+bank.count);
			Bank.count-= 1000;
			System.out.println("取款成功，账户余额为："+count);
		}
	}

}
