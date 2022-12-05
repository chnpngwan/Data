package com.w.java2;

/**
 * 请创建一个Car抽象类，要求有brand（品牌）属性，并且要求封装私有化，
 * 写出属性的 set、get方法。抽象类Car构造方法中也可以对brand属性赋值，
 * 写出一个抽象方法run （）。创建一个跑车类SportsCar继承抽象类Car。
 * 实现Car抽象方法输出一条语句“超 级跑车”，在本类中写出一个自己的方法price（），
 * 输出一条语句“售价100w”。在测 试类Test类中创建跑车对象car1，用构造器赋值品牌属性，输出属性，
 * 调用run（）、 price（）方法。创建跑车car2，用set方法赋值属性，输出属性，调用run（）、price （）方法。*/
public abstract class Car {
    private String brand;
    //抽象方法
    public abstract void run();
    public Car(){}

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
