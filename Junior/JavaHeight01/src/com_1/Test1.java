package com_1;
import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
public class Test1 {
	
	    private static final Object lock = new Object();
	 
	    public static void main(String[] args) {
	    	Test1 myExercises1 = new Test1();
	    	Test1 myExercises2 = new Test1();
	        ExecutorService executor = Executors.newFixedThreadPool(10);
	        executor.submit(myExercises2::B);
	        executor.submit(myExercises1::A);
	    }
	 
	    private void A() {
	        synchronized (lock){
	            while (true) {
	                for (int i = 1; i <= 10; i++) {
	                    if (i == 5) {
	                        try {
	                            lock.notify();
	                            lock.wait();
	                        } catch (InterruptedException e) {
	                            e.printStackTrace();
	                        }
	                        continue;
	                    }
	                    System.out.println("A ---> " + i);
	                }
	                System.out.println("---------------------------------");
	            }
	        }
	    }
	 
	    private void B() {
	        synchronized (lock){
	            while (true) {
	                try {
	                    lock.wait();
	                    System.out.println("B ---> 20");
	                    lock.notify();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }
	}
