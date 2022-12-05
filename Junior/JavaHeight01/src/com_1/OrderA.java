package com_1;

public class OrderA extends Thread{
	private static int a=1;
	@Override
	public void run() {
		while(a<=10) {
		System.out.println(Thread.currentThread().getName()+a);
		a++;
		}
	}
}
