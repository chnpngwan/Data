package javaOOP_03_1;

public class Student {
	//属性
	String name;
	int age;
	char sex;
	
	//构造方法的创建
	public Student() {}
	public Student(String name,int age,char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//行为
	public void study() {
		System.out.println("学生以学习为主（为中华之崛起而读书）");
		System.out.printf("%s说：我今年%d岁了,并且我是个%s的\n",name,age,sex);
	}

}
