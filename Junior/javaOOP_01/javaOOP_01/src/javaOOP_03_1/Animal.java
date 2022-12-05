package javaOOP_03_1;

public class Animal {
	//属性
	String name;
	int age;
	char sex;
	//方法
	public void eat() {
		System.out.println("动物会吃东西");
		System.out.println("这只动物是"+sex+"的，它叫"+name+"今年"+age+"岁了。");
	}
	
	public Animal() {}
	public Animal(String name,int age,char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	

}
