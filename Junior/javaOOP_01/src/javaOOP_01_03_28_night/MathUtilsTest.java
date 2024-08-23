package javaOOP_01_03_28_night;

import java.util.Arrays;

public class MathUtilsTest {
	public static void main(String[] args) {
		int[] arr = {9,1,5,3,7};
		int sum = MathUtils.addition(arr);
		System.out.println(sum);
		/*
		 * 静态方法的调用：类名.方法（）；
		 */
		double l = MathUtils.cicr(2.5);
		System.out.println("圆的周长为："+l);
		
		int[] sortArr = MathUtils.sort(arr);
		System.out.println("数组排完序后："+Arrays.toString(sortArr));
	}

}
