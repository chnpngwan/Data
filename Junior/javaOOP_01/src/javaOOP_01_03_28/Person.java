package javaOOP_01_03_28;

public abstract class Person {
	//��Ա����
	String name;
	//���󷽷������󷽷�������ڳ�������
	public abstract void say();
	//��ͨ����
	public void play() {
		System.out.println("���Ǹ����е�play");
	}
	//���췽����
	public Person() {}
}
