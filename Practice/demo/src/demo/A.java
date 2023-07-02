package demo;

import java.util.Scanner;

/**
 * @author ChnpngWng
 *
 * @date   Dec 19, 20224:37:50 PM
 */
public class A {
	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("shueu:");
		a=scanner.nextInt();
		if (a>10) {
			System.out.println("gao");
		}else if (a>=20) {
			System.out.println("z");
		}else {
		System.out.println("chu");	
		}
	}
}
