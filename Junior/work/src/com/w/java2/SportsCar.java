package com.w.java2;

import com.w.java2.Car;

public class SportsCar extends Car {
    public SportsCar(){}
    public SportsCar(String brand){
        super(brand);//调用父类有参构造方法
    }
    @Override
    public void run() {
        System.out.println("超级跑车");
    }

    public void price(){
        System.out.println("售价100W");
    }
}
