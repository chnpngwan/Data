package javaOOP_01_03_28;

public class PersonTest {
	public static void main(String[] args) {
//		Person p = new Person();
//		抽象类不能实例化对象（就是：不能new）
		Person p = new Student();
		p.name = "zhangsan";
		p.say();
		p.play();
	}

}
