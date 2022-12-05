package com.w.idea;

import java.util.Arrays;
import java.util.Scanner;

public class shulei {
//等差数列
//输入描述
//输入的第一行包含一个整数N。
//第二行包含N个整数A1，A2,…AN。(注意A1~AN并不一定是按等差数列中的顺序给出)
//其中，2<N<105，0<A<109。
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();//输入n个数
            int []  arr=new int[n];
            for (int i=0;i< arr.length;i++){
                arr[i]= scan.nextInt();//输出n里面的每一位数字
            }
            Arrays.sort(arr,0,n);//进行升序排列
            int d=0;
            for (int i=1;i<n-1;i++){//求相邻两个数最大公约数
                d=gcd(d,arr[i+1]-arr[i]);
            }
            if (d==0){//如果公差为0 直接输出n
                System.out.println(n);
            }else{
                int len=(arr[n-1]-arr[0])/d+1;
                System.out.println(len);
            }
        }

        private static int gcd(int a, int b) {//求出两个数的最大公约数的方法
            return b==0?a:gcd(b,a%b);
        }
}
