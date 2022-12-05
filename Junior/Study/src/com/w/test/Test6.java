package com.w.test;
//不死神兔
public class Test6 {
    public static void main(String[] args) {
        int [] arr=new int[20];
        arr[0]=1;
        arr[1]=1;
        for (int x=2;x< arr.length;x++){
            arr[x]=arr[x-2]+arr[x-1];
        }
        System.out.println("第二十个月兔子的对数："+arr[19]);
    }
}
