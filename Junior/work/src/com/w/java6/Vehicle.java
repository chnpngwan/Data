package com.w.java6;
/*
 第一题:类的成员变量(属性):
请定义一个交通工具(vehicle)的类其中有;属性速度(speed),车长度(length)等等.
方法: 移动(move())、设置速度(setSpeed(int speed))、加速(SpeedUp)、
减速SpeedDown)等等,最后在测试类vehicleTest中的main()中实例化一个交通工具
对象并通过方法给它初始化speed,size的值并且通过打印出来,另外调用加速减速的
方法对速度进行改变.
 */
public class Vehicle {
    double speed;
    double length;
    String size;

    public Vehicle(double speed, double length, String size) {
        this.speed = speed;
        this.length = length;
        this.size = size;
    }
    public void move(){
        System.out.println(size+"正在以"+speed+"km/h的速度行驶，车长"+length+"m");
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public double speedUp(double n){
//        setSpeed((int) n);
        return speed+=n;
    }
    public double speedDown(double n){
        return speed-=n;
    }
}
