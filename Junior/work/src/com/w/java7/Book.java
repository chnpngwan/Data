package com.w.java7;
/*
 第二题：编写自定义类（Book）实现图书信息设置任务:
属性:书名、作者、出版社、价格
方法:信息介绍
要求:
设计构造函数实现对属性赋值
设置私有属性，get/set方法实现对属性的访问
限定图书价格必须大于10，如果无效需进行提示，并强制赋值为10。
限定作者、书名均为只读属性
信息介绍方法描述图书所有信息
 */
public class Book {
    private String name;
    private String auther;
    private String publisher;
    private double price;

    public Book(String name, String auther, String publisher, double price) {
        this.name = name;
        this.auther = auther;
        this.publisher = publisher;
        this.price = price;
    }
    public void show(){
        System.out.println(name+"的作者是"+auther+"出版社"+publisher+"价格是"+price+"￥");
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
       if (price>=10){
           this.price=price;
       }else {
           System.out.println("图书的价格必须大于等于10");
           this.price=10;
       }
    }

    public String getName() {
        return name;
    }

    public String getAuther() {
        return auther;
    }
}
