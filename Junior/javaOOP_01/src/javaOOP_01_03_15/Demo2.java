package javaOOP_01_03_15;

public class Demo2 {
	String name;
	public void play() {
		display();
	}
	static public void display() {
		//��̬�����в���ֱ�ӷ��ʷǾ�̬�ķ���������
//		play();
		Demo2 d = new Demo2();
		System.out.println(d.name);
		d.play();
	}

}
