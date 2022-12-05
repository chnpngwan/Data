package com.w.java418;

import java.util.Scanner;

/**
 * @author admin
 */
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number =(int) (Math.random()*100-1);
        while (true){
            System.out.println("请输入一个正整数：");
            int guessNumber=scanner.nextInt();
            if (guessNumber>number){
                System.out.println("猜大了");
                continue;
            }else if (guessNumber<number){
                System.out.println("猜小了");
                continue;
            }else {
                System.out.println("恭喜，猜对了");
                break;
            }
        }
    }
}
