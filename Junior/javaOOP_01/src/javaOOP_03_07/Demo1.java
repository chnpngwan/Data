package javaOOP_03_07;

public class Demo1 {
	//private ���εķ���
	private void aoo() {
		System.out.println("private ���εķ���");
	}
	//Ĭ�Ϸ������η�
	void boo() {
		System.out.println("Ĭ�Ϸ������η����εķ���");
	}
	//protected���εķ���
	protected void coo() {
		System.out.println("protected���εķ���");
	}
	//public���εķ���
	public void doo() {
		System.out.println("public���εķ���");
	}
	
	//����
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.aoo();
		d.boo();
		d.coo();
		d.doo();
	}

}
