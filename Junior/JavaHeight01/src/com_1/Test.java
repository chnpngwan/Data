package com_1;

public class Test implements Runnable{
	private static Test test=new Test();
	private int num=50;
	public void fetch(String name) {
		synchronized (test) {
		if (num>0) {
			System.out.println(name+"正在售卖第"+num+"号票");
			num--;
			}
		try {
			Thread.sleep(500);
		}catch (Exception e) {
			e.printStackTrace();
			}
		}
	}
	@Override
	public void run() {
		while (num>0) {
			this.fetch(Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		Test test = new Test();
		Thread thread1=new Thread(test,"窗口1");
		Thread thread2=new Thread(test,"窗口2");
		Thread thread3=new Thread(test,"窗口3");
		Thread thread4=new Thread(test,"窗口4");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
