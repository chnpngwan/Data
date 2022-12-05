package javaOOP_01_03_22;

public class Student extends Person{
	@Override
	public void job() {
		System.out.println("学生的主要工作是学习！");
	}
	public void say() {
		System.out.println("他说他有理，你说你有理！");
	}
}
