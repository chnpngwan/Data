package javaOOP_01_03_22;

public class Tigger extends Animal{
	@Override
	public void eat() {//��д����
		System.out.println("�ϻ�Ҫ�����⣡");
	}
	//super ָ����ǰ��ĸ���
	public void action() {
		super.eat();
		System.out.println("�ϻ����ˣ�Ҫ��ʼ��ʳ�ˣ�");
	}

}
