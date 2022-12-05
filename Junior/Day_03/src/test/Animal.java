package test;

public abstract class Animal {
	public abstract void play(); 
}
class Cat extends Animal{
@Override
public void play() {
	System.out.println("我是猫，我玩老鼠");
	}
}
class Dog extends Animal{
	@Override
	public void play() {
		System.out.println("我是狗，我玩球");
	}
}