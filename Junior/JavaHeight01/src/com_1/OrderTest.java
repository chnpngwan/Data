package com_1;

public class OrderTest {
	public static void main(String[] args) {
		OrderA orderA=new OrderA();
		orderA.setName("线程a");
		OrderB orderB=new OrderB(orderA);
		orderB.setName("线程b");
		orderA.start();
		orderB.start();
	}
}
