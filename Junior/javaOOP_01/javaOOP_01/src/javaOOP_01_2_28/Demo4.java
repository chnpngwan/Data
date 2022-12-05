package javaOOP_01_2_28;
//1、输出1~100之间所有的3的倍数
public class Demo4 {
	public static void main(String[] args) {
		int i=1;
		while(i<=100) {
			if(i%3==0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
