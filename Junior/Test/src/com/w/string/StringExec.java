package com.w.string;

import java.util.Random;
/**
 * 使用String随机生成5位验证码
 * */
public class StringExec {
    public static void main(String[] args) {
        String datas="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String code="";
        Random random=new Random();
        for (int i=0;i<5;i++){
            int index=random.nextInt(datas.length());
            char c=datas.charAt(index);
            code +=c;
        }
        System.out.println(code);
    }
}
