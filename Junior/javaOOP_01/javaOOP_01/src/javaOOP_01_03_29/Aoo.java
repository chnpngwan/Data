package javaOOP_01_03_29;

public interface Aoo {
	public static final String NAME="张三";
	public abstract void play();
	public void show();
//	public void play() {}
//	public Aoo() {}
}

interface Boo{
	public void display();
}
//接口的多继承：接口不能继承类
interface Coo extends Aoo,Boo{
	
}
