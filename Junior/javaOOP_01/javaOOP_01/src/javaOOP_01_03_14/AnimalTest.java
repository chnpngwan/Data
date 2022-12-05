package javaOOP_01_03_14;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		//封装之前
//		a.name = "小狗";
//		a.age = 2;
//		System.out.println(a.name+","+a.age);
		//封装之后
		a.setName("旺财");
		a.setAge(1);
		System.out.println(a.getName()+"，"+a.getAge());
	}

}
