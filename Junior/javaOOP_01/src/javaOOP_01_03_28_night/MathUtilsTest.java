package javaOOP_01_03_28_night;

import java.util.Arrays;

public class MathUtilsTest {
	public static void main(String[] args) {
		int[] arr = {9,1,5,3,7};
		int sum = MathUtils.addition(arr);
		System.out.println(sum);
		/*
		 * ��̬�����ĵ��ã�����.����������
		 */
		double l = MathUtils.cicr(2.5);
		System.out.println("Բ���ܳ�Ϊ��"+l);
		
		int[] sortArr = MathUtils.sort(arr);
		System.out.println("�����������"+Arrays.toString(sortArr));
	}

}
