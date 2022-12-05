package javaOOP_01_03_14;
/*static修饰那些东西？
 * 1、修饰变量==>静态变量
 * 2、修饰方法==>静态方法
 * 3、static{}静态代码块
 * 
 * 注意：
 * 1、静态方法可以直接访问静态方法。但是静态方法不能直接访问普通方法，若要访问需要创建
 * 对象，通过对象访问。
 * 2、静态方法不能直接访问非静态的属性，需要通过对象。
 */
public class Demo1 {
	static String name;//静态变量
	//static 修饰方法
	public static void show() {
		System.out.println("这是static修饰的静态方法！");
//		play();
	}
	public void play() {
		show();
	}
	
	static {
		System.out.println("这就是传说中的静态代码块！");
	}
	
	public static void main(String[] args) {
		show();
	}

}
