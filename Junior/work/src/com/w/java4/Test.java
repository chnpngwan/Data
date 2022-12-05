package com.w.java4;

public class Test {
    public static void main(String[] args) {
        Flower flower=new Flower("白色",10);
        flower.showInfo();
        Rose rose=new Rose();
        rose.setColor("紫色");
        rose.setPrice(30);
        rose.setLoad("大理");
        rose.showInfo();
        rose.warn();
    }
}
