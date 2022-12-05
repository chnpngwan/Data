package javaOOP_01_2_28;
//2、利用for循环输出数据，要求：奇数行和偶数行的数据不一样。
public class Demo5 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println("java基础编程");
			}else {
				System.out.println("python编程");
			}
		}
	}

}
