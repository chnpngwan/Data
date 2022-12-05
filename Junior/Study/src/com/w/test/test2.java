package com.w.test;

public class test2 {
    public static void main(String[] args) {
        int count=0;
        double paper=0.1;
        int z=8844430;
        while (paper<=z){
            paper +=2;
            count++;
        }
        System.out.println("需要折叠："+count+"次");
    }
}
