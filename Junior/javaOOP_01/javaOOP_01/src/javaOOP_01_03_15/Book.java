package javaOOP_01_03_15;
import java.util.Date;

public class Book {
	public static int booknum = 0;
	static {
		print();
		System.out.println("这是静态代码块！");
	}
	public static void print() {
		System.out.println("这是静态方法！");
	}
	public Book() {
		System.out.println("这是构造方法！");
		booknum+=1;//booknum++;
	}
	public static void main(String[] args) {
		new Book();
	}

}
