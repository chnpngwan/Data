package com.w._0328;

import java.util.Arrays;

public class MathUtils {
	static final double pi=3.14159268;
	private static int[] data;
	//¾²Ì¬·½·¨
	public static int  addition(int[] data) {
		int sum=0;
		for (int d:data) {
			sum+=d;
			
		}
		return sum;
	}
	public static double cicr(double r) {
		return 2*pi*r;
	}
	public static int[] sort(int [] data) {
		Arrays.sort(data);
		return data;
	}
	public static double p(double pa){
		return pa;
	}
}
