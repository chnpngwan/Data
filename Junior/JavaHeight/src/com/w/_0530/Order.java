package com.w._0530;

import sun.misc.PostVMInitHook;

import java.sql.PreparedStatement;
import java.sql.SQLOutput;

/**
 * ClassName:Order
 * PackageName:com.w._0530
 * Description:
 *
 * @date:2022/5/30 13:51
 * @author: wangchunping
 */
public class Order {
    private String orderNumber;
    private double orderAmount;
    private String username;

    public Order() {
        super();
    }

    public Order(String orderNumber, double orderAmount, String username) {
        this.orderNumber = orderNumber;
        this.orderAmount = orderAmount;
        this.username = username;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

class ProcessOrder implements Runnable{
    private Order order;
    private static Integer count=1;
    public ProcessOrder(Order order){
        this.order=order;
    }

    @Override
    public void run() {
        generateOrderNumber();
    }
    public void generateOrderNumber() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (count) {
            StringBuffer orderNumber = new StringBuffer("").append(System.currentTimeMillis()).append(count++);
            order.setOrderNumber(orderNumber.toString());
        }
        System.out.printf("%s的订单金额是%.2f元，订单编号是%s\n", order.getUsername(), order.getOrderAmount(), order.getOrderNumber());
    }
}

class TestOrder{
    public static void main(String[] args) {
        Order order1=new Order(null,300,"张三");
        Order order2=new Order(null,400,"李四");
        Order order3=new Order(null,500,"王五");
        Order order4=new Order(null,300,"赵六");
        Order order5=new Order(null,200,"秦七");
        ProcessOrder processOrder1=new ProcessOrder(order1);
        ProcessOrder processOrder2=new ProcessOrder(order2);
        ProcessOrder processOrder3=new ProcessOrder(order3);
        ProcessOrder processOrder4=new ProcessOrder(order4);
        ProcessOrder processOrder5=new ProcessOrder(order5);
        Thread thread01=new Thread(processOrder1);
        Thread thread02=new Thread(processOrder2);
        Thread thread03=new Thread(processOrder3);
        Thread thread04=new Thread(processOrder4);
        Thread thread05=new Thread(processOrder5);
        thread01.start();
        thread02.start();
        thread03.start();
        thread04.start();
        thread05.start();
    }
}