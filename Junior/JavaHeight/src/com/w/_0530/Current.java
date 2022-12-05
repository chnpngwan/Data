package com.w._0530;

import java.util.Stack;

/**
 * ClassName:Current
 * PackageName:com.w._0530
 * Description:
 *
 * @date:2022/5/30 13:28
 * @author: wangchunping
 */
public class Current implements Runnable{
    private static Current current=new Current();
    private int num=20;
    public void fetch(String name){
        synchronized (current){
            if (num>0){
                System.out.println(name+"\t采花\t❀"+num);
                num--;
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        while (num>0){
            this.fetch(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread thread1=new Thread(current);
        thread1.setName("猴子A");
        Thread thread2=new Thread(current);
        thread2.setName("猴子B");
        Thread thread3=new Thread(current);
        thread3.setName("猴子C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
