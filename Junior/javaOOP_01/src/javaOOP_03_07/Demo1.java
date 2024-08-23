package javaOOP_03_07;

public class Demo1 {
	//private 修饰的方法
	private void aoo() {
		System.out.println("private 修饰的方法");
	}
	//默认访问修饰符
	void boo() {
		System.out.println("默认访问修饰符修饰的方法");
	}
	//protected修饰的方法
	protected void coo() {
		System.out.println("protected修饰的方法");
	}
	//public修饰的方法
	public void doo() {
		System.out.println("public修饰的方法");
	}
	
	//测试
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.aoo();
		d.boo();
		d.coo();
		d.doo();
	}

}
