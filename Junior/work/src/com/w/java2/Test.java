package com.w.java2;

import com.w.java2.SportsCar;

public class Test {
    public static void main(String[] args) {
        //初始化数据
        SportsCar car1=new SportsCar("迈凯伦");
        System.out.println(car1.getBrand());
        car1.run();
        car1.price();
        System.out.println("------------------");
        SportsCar car2=new SportsCar();
        car2.setBrand("劳斯莱斯幻影");
        System.out.println(car2.getBrand());
        car2.run();
        car2.price();
    }
}
