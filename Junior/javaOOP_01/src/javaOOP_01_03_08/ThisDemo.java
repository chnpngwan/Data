package javaOOP_01_03_08;

public class ThisDemo {
	String name;
	int age;
	//�ֲ�����û��Ĭ��ֵ��ʹ��֮ǰ��Ҫ���г�ʼ��
	public void show() {
		String name = "����";
		this.name = name;
	}
	public void play() {
		this.show();
	}
	
	public ThisDemo() {
		
	}

	public ThisDemo(String name,int age) {
		this.name = name;
		this.age = age;
	}
}
