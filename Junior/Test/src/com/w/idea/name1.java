package com.w.idea;

public class name1 {
        public static void main(String[] args) {
            java.lang.String[] name = {"吴明忠","朱凡吉","尹申正","李梦瑶","田志强","吴佳凌","罗校国","马昊天"};
            int num = (int)(Math.random() * 1000);
            while (num>name.length-1) {
                if (num<=name.length-1) {
                    break;
                }
                num = (int)(Math.random() * 1000);
            }
            System.out.println("被抽到的同学是:"+name[num]);
        }
}
