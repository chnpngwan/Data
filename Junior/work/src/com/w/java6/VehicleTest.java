package com.w.java6;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle(60,14.5,"东风卡车");
        vehicle.move();
        System.out.println("加速");
        vehicle.speedUp(10);
        vehicle.move();
        System.out.println("减速");
        vehicle.speedDown(5);
        vehicle.move();
    }
}
