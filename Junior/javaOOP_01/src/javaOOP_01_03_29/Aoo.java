package javaOOP_01_03_29;

public interface Aoo {
	public static final String NAME="����";
	public abstract void play();
	public void show();
//	public void play() {}
//	public Aoo() {}
}

interface Boo{
	public void display();
}
//�ӿڵĶ�̳У��ӿڲ��ܼ̳���
interface Coo extends Aoo,Boo{
	
}
