package javaOOP_01_03_21_02;

public class Person {
	public void say() {
		System.out.println("好好学习，天天向上！");
	}
//	private void say() {
//		System.out.println("方法的重载与修饰词无关！");
//	}
//	public int say() {
//		System.out.println("方法的返回值与重载无关！");
//		return 0;
//	}
	
	
	
	
	
	
	
	
	
	
	
	public void say(int a) {
		System.out.println("好好学习，越来越优秀！");
	}
//	public void say(int b) {
//		System.out.println("方法的重载与参数的类型有关！");
//	}
	public void say(String name) {
		System.out.println("方法的重载与参数的类型有关！");
	}
	public void say(String name,String sex) {
		System.out.println("方法的重载与参数的个数有关！");
	}
	public void say(int a,String name) {
		System.out.println();
	}
	public void say(String name,int a) {
		System.out.println("方法的重载与不同类型参数的顺序有关！");
	}
	
	

}
