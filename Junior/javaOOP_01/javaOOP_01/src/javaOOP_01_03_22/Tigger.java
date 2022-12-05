package javaOOP_01_03_22;

public class Tigger extends Animal{
	@Override
	public void eat() {//重写方法
		System.out.println("老虎要吃肉肉！");
	}
	//super 指代当前类的父类
	public void action() {
		super.eat();
		System.out.println("老虎饿了，要开始捕食了！");
	}

}
