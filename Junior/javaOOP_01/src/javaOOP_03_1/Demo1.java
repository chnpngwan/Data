package javaOOP_03_1;

public class Demo1 {
	//无参无返回值
	public void aoo() {
		System.out.println("这是无参无返回值方法");
	}
	//无参有返回值的方法
	public int boo() {
		System.out.println("这是无参有返回值的方法");
		return 0;
	}
	//有参无返回值的方法
	public void coo(String str) {
		System.out.println("这是有参无返回值的方法，并且参数是："+str);
	}
	//这是有参有返回值的方法
	public int doo(String str) {
		System.out.println("这是有参有返回值的方法，并且参数是："+str);
		return 0;
	}
	
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.aoo();
		int a = d.boo();
		System.out.println(a);
		d.coo("鹏哥");
		int b = d.doo("Jack");
		System.out.println(b);
	}

}
