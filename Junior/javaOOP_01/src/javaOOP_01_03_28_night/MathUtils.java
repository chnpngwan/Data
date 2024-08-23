package javaOOP_01_03_28_night;

import java.util.Arrays;

public final class MathUtils {
	//定义静态常量
	static final double pi = 3.14159268;
	//定义静态方法
	public static int addition(int[] data) {
		//求和
		int sum = 0;
		for(int d:data) {
			sum+=d;
		}
		return sum;
	}
	//求圆的周长
	public static double cicr(double r) {
		return 2*pi*r;
	}
	//给数组排序
	public static int[] sort(int[] data) {
		Arrays.sort(data);//排序
		return data;
	}
}
