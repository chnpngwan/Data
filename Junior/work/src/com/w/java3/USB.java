package com.w.java3;
/**
 * 完成那个USB接口的例子，分别定义USB接口，两个方法start，stop。
 * 两个子类：Flash和Print，重写两个方法，方法中随便输出两句话。
 * 定义计算机类Computer，有一个plugin方法，有一个USB类型的参数，
 * 用来调用start和stop。在主方法中实例化Computer类，调用plugin方法，
 * 分别传递Flash和Print的对象，通过向上转型，完成功能。*/
public interface USB {
    public void start();
    public void stop();
}
class Flash implements USB{
    @Override
    public void start() {
        System.out.println("Flash:开始读取数据");
    }

    @Override
    public void stop() {
        System.out.println("Flash:停止读取数据");
    }
}
class Print implements USB{
    @Override
    public void start() {
        System.out.println("Print:开始读取数据");
    }

    @Override
    public void stop() {
        System.out.println("Print:停止读取数据");
    }
}