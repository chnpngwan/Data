package javaOOP_01_03_28_night;

import java.util.Arrays;

public final class MathUtils {
	//���徲̬����
	static final double pi = 3.14159268;
	//���徲̬����
	public static int addition(int[] data) {
		//���
		int sum = 0;
		for(int d:data) {
			sum+=d;
		}
		return sum;
	}
	//��Բ���ܳ�
	public static double cicr(double r) {
		return 2*pi*r;
	}
	//����������
	public static int[] sort(int[] data) {
		Arrays.sort(data);//����
		return data;
	}
}
