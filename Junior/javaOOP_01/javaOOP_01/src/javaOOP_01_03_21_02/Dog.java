package javaOOP_01_03_21_02;

public class Dog extends Animal{
	
	@Override//注解：用于检查方法是否是重写方法
	public void  eat() {
		System.out.println("狗狗最喜欢吃骨头！");
	}
}
