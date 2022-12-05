package com.w.java3;

public class Computer {
    public void plugin(USB usb){
        usb.start();
        usb.stop();
    }

    public static void main(String[] args) {
        //向上转型
        USB flash=new Flash();
        USB print=new Print();
        Computer computer=new Computer();
        computer.plugin(flash);
        computer.plugin(print);
    }
}
