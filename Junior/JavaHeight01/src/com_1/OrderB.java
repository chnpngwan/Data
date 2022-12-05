package com_1;

public class OrderB extends Thread{
	
	private static int b=11;
	private OrderA orderA=null;
public OrderB(OrderA orderA) {
	this.orderA=orderA;
}
	@Override
	public void run() {
		try {
			orderA.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while (b<=20) {
			System.out.println(Thread.currentThread().getName()
					+b);
			b++;
		}
		
	}
}
