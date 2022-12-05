package com.w.test;
//三个和尚
public class Test1 {
    public static void main(String[] args) {
        int height1=150;
        int height2=180;
        int height3=200;
        int tempHeight=height1>height2?height1:height2;
        int maxHeight=tempHeight>height3?tempHeight:height3;
        System.out.println("maxHeight:"+maxHeight);
    }
}
