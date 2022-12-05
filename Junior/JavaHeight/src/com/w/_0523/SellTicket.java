package com.w._0523;

/**
 * ClassName:SellTicket
 * PackageName:com.w._0523
 * Description:
 *
 * @date:2022/5/23 13:32
 * @author: wangchunping
 */
public class SellTicket implements Runnable{
        private int ticket=50;
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"出售第"+ticket--+"张车票");
            if (ticket<=0){
                break;
            }
        }
    }
    public static void main(String[] args){
        SellTicket ticketWindows01=new SellTicket();
        Thread thread01=new Thread(ticketWindows01);
        thread01.setName("窗口1");
        Thread thread02=new Thread(ticketWindows01);
        thread01.setName("窗口2");
        Thread thread03=new Thread(ticketWindows01);
        thread01.setName("窗口3");
        thread01.start();
        thread02.start();
        thread03.start();
    }
}
