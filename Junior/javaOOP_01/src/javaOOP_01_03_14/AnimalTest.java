package javaOOP_01_03_14;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		//��װ֮ǰ
//		a.name = "С��";
//		a.age = 2;
//		System.out.println(a.name+","+a.age);
		//��װ֮��
		a.setName("����");
		a.setAge(1);
		System.out.println(a.getName()+"��"+a.getAge());
	}

}
