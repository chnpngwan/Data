package com.w.java418;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author admin
 */
public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = scanner.next();
        System.out.println("字符串长度为：" + str.length());
        //统计字符次数
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);//排序
        System.out.println(arr);
        char max='0';
//        char max = arr[0];
        int count = 0;
        int maxCount=0;
        for (int i=0;i< arr.length-1;i++){
/**           max=arr[0];
           if (max==arr[i]){
               count++;
           }
        }*/
            if (arr[i]==arr[i+1]){
                count++;
                        }
            if (arr[i]!=arr[i+1]){
                if (count>maxCount){
                    maxCount=count;
                    max=arr[i];
                }
            }
            count=1;
        }
        System.out.printf(max+":"+maxCount);
    }
}
