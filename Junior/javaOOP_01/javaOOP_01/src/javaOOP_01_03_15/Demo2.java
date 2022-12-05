package javaOOP_01_03_15;

public class Demo2 {
	String name;
	public void play() {
		display();
	}
	static public void display() {
		//静态方法中不能直接访问非静态的方法和属性
//		play();
		Demo2 d = new Demo2();
		System.out.println(d.name);
		d.play();
	}

}
