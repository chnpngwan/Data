package javaOOP_03_07;

public class Demo2 {
	/*
	 * 修饰词  返回值类型  方法名称（数据类型...变量名称）{
	 * 		方法体；
	 * }
	 */
	public void aoo(int x,String...str) {
		System.out.println("这是一个有可变参数的方法");
		if(str!=null&&str.length>0) {
			for(String s:str) {
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		d2.aoo(10);
		d2.aoo(12, "张三","里斯","肖二河");
	}

}
