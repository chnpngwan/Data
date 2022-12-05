package javaOOP_01_03_28;

public  class Animal {
	//final修饰的成员变量需要进行初始化
	final String name = "狗子";
	//
	public final void eat(final int age) {
		System.out.println("这是final修饰的方法");
//		age = 10;
	}
}
