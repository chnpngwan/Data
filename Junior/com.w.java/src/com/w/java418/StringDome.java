package com.w.java418;

import java.util.Arrays;

/**
 * @author admin
 */
public class StringDome {
    public static void main(String[] args) {
        String string="ilkejava";
        string=string.replace('i','-');
        System.out.println(string);
        String[] arr=string.split("-");
        System.out.println(Arrays.toString(arr));
        for (String s:arr){
            System.out.println(s);
        }
    }
}
