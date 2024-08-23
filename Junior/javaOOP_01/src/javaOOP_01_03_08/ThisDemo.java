package javaOOP_01_03_08;

public class ThisDemo {
	String name;
	int age;
	//局部变量没有默认值，使用之前需要进行初始化
	public void show() {
		String name = "张三";
		this.name = name;
	}
	public void play() {
		this.show();
	}
	
	public ThisDemo() {
		
	}

	public ThisDemo(String name,int age) {
		this.name = name;
		this.age = age;
	}
}
