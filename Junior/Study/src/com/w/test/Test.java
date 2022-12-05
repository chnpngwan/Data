package com.w.test;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int number=random.nextInt(100)+1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要猜的数字：");
            int guessNumber = scanner.nextInt();
            if (guessNumber > number) {
                System.out.println("你猜的数字" + guessNumber + "大了");
            } else if (guessNumber < number) {
                System.out.println("你猜的数字" + guessNumber + "小了");
            } else {
                System.out.println("恭喜猜中");
                break;
            }
        }
    }
}
