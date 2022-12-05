package com.w._0530;

import com.w._0523.SellTicket;

/**
 * ClassName:SellTicketBySync
 * PackageName:com.w._0530
 * Description:
 *
 * @date:2022/5/30 13:40
 * @author: wangchunping
 */
public class SellTicketBySync implements Runnable{
    private int ticket=50;
    @Override
    public void run() {
        while (true){
            if (this.ticket>0){
                try {
                    Thread.sleep(500);
                    SellTicket();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                break;
            }
        }
    }
    public synchronized void SellTicket() throws InterruptedException {
        if (this.ticket>0){
            System.out.println(Thread.currentThread().getName()+"出售第"+ticket--+"张车票");
        }
    }


}
