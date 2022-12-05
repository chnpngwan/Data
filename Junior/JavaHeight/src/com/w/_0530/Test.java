package com.w._0530;

/**
 * ClassName:Test
 * PackageName:com.w._0530
 * Description:
 *
 * @date:2022/5/30 14:56
 * @author: wangchunping
 */
public class Test {
    public static void main(String[] args) {
        SellTicketBySync runnableInstance=new SellTicketBySync();

        Thread thread2=new Thread(runnableInstance,"窗口2");
        Thread thread3=new Thread(runnableInstance,"窗口3");
        Thread thread1=new Thread(runnableInstance,"窗口1");

        thread3.start();
        thread2.start();thread1.start();
    }
}
