package javaOOP_01_03_15;
import java.util.Date;

public class Book {
	public static int booknum = 0;
	static {
		print();
		System.out.println("���Ǿ�̬����飡");
	}
	public static void print() {
		System.out.println("���Ǿ�̬������");
	}
	public Book() {
		System.out.println("���ǹ��췽����");
		booknum+=1;//booknum++;
	}
	public static void main(String[] args) {
		new Book();
	}

}
