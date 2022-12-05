package javaOOP_01_03_28;

public abstract class Person {
	//成员变量
	String name;
	//抽象方法：抽象方法必须放在抽象类中
	public abstract void say();
	//普通方法
	public void play() {
		System.out.println("这是父类中的play");
	}
	//构造方法：
	public Person() {}
}
